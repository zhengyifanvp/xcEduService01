package com.xuecheng.framework.domain.ucenter.response;

import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
* @name: LoginResult
*
* @description: 登录返回的结果集
*
* @author: Yifan Zheng
*
* @Date: 2020/3/16
*
* @Version：1.0
**/
@Data
@ToString
@NoArgsConstructor
public class LoginResult extends ResponseResult {
    public LoginResult(ResultCode resultCode,String token) {
        super(resultCode);
        this.token = token;
    }
    private String token;
}
