package com.xuecheng.api.ucenter;

import com.xuecheng.framework.domain.ucenter.XcUser;
import com.xuecheng.framework.domain.ucenter.ext.XcUserExt;
import com.xuecheng.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
* @name: UcenterControllerApi
*
* @description: 用户中心接口
*
* @author: Yifan Zheng
*
* @Date: 2020/3/20
*
* @Version：1.0
**/
@Api(value = "用户中心",description = "用户中心管理")
public interface UcenterControllerApi {

    @ApiOperation("根据用户账号查询用户信息")
    public XcUserExt getUserext(String username);

    @ApiOperation("注册")
    public ResponseResult register(XcUser user);
}
