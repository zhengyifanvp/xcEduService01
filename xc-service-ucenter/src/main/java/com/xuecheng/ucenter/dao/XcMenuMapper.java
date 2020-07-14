package com.xuecheng.ucenter.dao;

import com.xuecheng.framework.domain.ucenter.XcMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @name: XcMenuMapper
*
* @description: 用户的权限
*
* @author: Yifan Zheng
*
* @Date: 2020/3/28
*
* @Version：1.0
**/
@Mapper
public interface XcMenuMapper {
    //根据用户id查询用户的权限
    public List<XcMenu> selectPermissionByUserId(String userid);
}
