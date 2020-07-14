package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;
/**
* @name: CustomException
*
* @description: 自定义异常类型
*
* @author: Yifan Zheng
*
* @Date: 2020/1/14
*
* @Version：1.0
**/
public class CustomException extends RuntimeException{
    //错误代码
    ResultCode resultCode;

    public CustomException(ResultCode resultCode){
        this.resultCode = resultCode;
    }
    public ResultCode getResultCode(){
        return resultCode;
    }
}
