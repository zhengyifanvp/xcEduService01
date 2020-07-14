package com.xuecheng.ucenter.service;

import com.xuecheng.framework.domain.ucenter.XcCompanyUser;
import com.xuecheng.framework.domain.ucenter.XcMenu;
import com.xuecheng.framework.domain.ucenter.XcUser;
import com.xuecheng.framework.domain.ucenter.ext.XcUserExt;
import com.xuecheng.framework.domain.ucenter.response.AuthCode;
import com.xuecheng.framework.exception.ExceptionCast;
import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.ucenter.dao.XcCompanyUserRepository;
import com.xuecheng.ucenter.dao.XcMenuMapper;
import com.xuecheng.ucenter.dao.XcUserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
* @name: UserService
*
* @description: 用户信息的service
*
* @author: Yifan Zheng
*
* @Date: 2020/3/21
*
* @Version：1.0
**/
@Service
public class UserService {

    @Autowired
    XcUserRepository xcUserRepository;

    @Autowired
    XcCompanyUserRepository xcCompanyUserRepository;

    @Autowired
    XcMenuMapper xcMenuMapper;

    //根据账号查询xcUser信息
    public XcUser findXcUserByUsername(String username){
        return xcUserRepository.findByUsername(username);
    }

    //根据账号查询用户信息
    public XcUserExt getUserExt(String username){
        //根据账号查询xcUser信息
        XcUser xcUser = this.findXcUserByUsername(username);
        if(xcUser == null){
            return null;
        }
        //用户id
        String userId = xcUser.getId();
        //查询用户所有权限
        List<XcMenu> xcMenus = xcMenuMapper.selectPermissionByUserId(userId);

        //根据用户id查询用户所属公司id
        XcCompanyUser xcCompanyUser = xcCompanyUserRepository.findByUserId(userId);
        //取到用户的公司id
        String companyId = null;
        if(xcCompanyUser!=null){
            companyId = xcCompanyUser.getCompanyId();
        }
        XcUserExt xcUserExt = new XcUserExt();
        BeanUtils.copyProperties(xcUser,xcUserExt);
        xcUserExt.setCompanyId(companyId);
        //设置权限
        xcUserExt.setPermissions(xcMenus);
        return xcUserExt;

    }

    //注册账号
    @Transactional
    public ResponseResult register(XcUser xcUser){
        String username = xcUser.getUsername();
        XcUser user = xcUserRepository.findByUsername(username);
        if (user != null) {
            ExceptionCast.cast(AuthCode.AUTH_REGISTER_USERNAME_EXIST);
        }
        String name = xcUser.getName();
        if(name.contains("管理员")){
             ExceptionCast.cast(AuthCode.AUTH_REGISTER_NAME_ERROR);
        }
        xcUser.setCreateTime(new Date());
        xcUser.setUpdateTime(new Date());
        xcUser.setStatus("1");
        xcUser.setUtype("00000");
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = xcUser.getPassword();
        xcUser.setPassword(encoder.encode(password));
        XcUser save = xcUserRepository.save(xcUser);
        if(save != null){
            return ResponseResult.SUCCESS();
        }
        return ResponseResult.FAIL();
    }

}
