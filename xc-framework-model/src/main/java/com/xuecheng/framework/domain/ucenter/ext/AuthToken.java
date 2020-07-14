package com.xuecheng.framework.domain.ucenter.ext;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
* @name: AuthToken
*
* @description: 存储令牌的数据对象
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
public class AuthToken {
    String access_token;//访问token
    String refresh_token;//刷新token
    String jwt_token;//jwt令牌
}
