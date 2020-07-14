package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;
import org.springframework.web.bind.annotation.ControllerAdvice;

public class ExceptionCast {
    public static void cast(ResultCode resultCode){
        throw new CustomException(resultCode);
    }
}
