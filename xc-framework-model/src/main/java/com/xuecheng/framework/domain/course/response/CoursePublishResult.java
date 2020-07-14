package com.xuecheng.framework.domain.course.response;

import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
* @name: CoursePublishResult
*
* @description: 前端显示课程预览页面的封装类
*
* @author: Yifan Zheng
*
* @Date: 2020/2/23
*
* @Version：1.0
**/
@Data
@ToString
@NoArgsConstructor
public class CoursePublishResult extends ResponseResult {
    String previewUrl;//页面的url，必须得到页面id才可以拼装
    public CoursePublishResult(ResultCode resultCode, String previewUrl) {
        super(resultCode);
        this.previewUrl = previewUrl;
    }
}
