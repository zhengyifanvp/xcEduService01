package com.xuecheng.framework.domain.ucenter.ext;

import com.xuecheng.framework.domain.ucenter.XcMenu;
import com.xuecheng.framework.domain.ucenter.XcUser;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @name: XcUserExt
* 
* @description: 用户信息的扩展类 带权限
* 
* @author: Yifan Zheng
*
* @Date: 2020/3/20
*
* @Version：1.0
**/
@Data
@ToString
public class XcUserExt extends XcUser {

    //权限信息
    private List<XcMenu> permissions;

    //企业信息
    private String companyId;
}
