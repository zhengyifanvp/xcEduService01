package com.xuecheng.framework.domain.ucenter.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;
import lombok.ToString;

/**
* @name: Register
*
* @description:
*
* @author: Yifan Zheng
*
* @Date: 2020/3/16
*
* @Version：1.0
**/
@Data
@ToString
public class RegisterRequest extends RequestData {
    String username;
    String password;
}
