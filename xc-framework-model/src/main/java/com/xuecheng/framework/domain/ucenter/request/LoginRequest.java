package com.xuecheng.framework.domain.ucenter.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;
import lombok.ToString;

/**
* @name: LoginRequest
*
* @description: 用户登录请求的数据对象
*
* @author: Yifan Zheng
*
* @Date: 2020/3/16
*
* @Version：1.0
**/
@Data
@ToString
public class LoginRequest extends RequestData {

    String username;
    String password;
    String verifycode;

}
