package com.xuecheng.framework.domain.course.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;
import lombok.ToString;

/**
* @name: CourseListRequest
*
* @description:
*
* @author: Yifan Zheng
*
* @Date: 2020/1/29
*
* @Version：1.0
**/
@Data
@ToString
public class CourseListRequest extends RequestData {
    //公司Id
    private String companyId;
}
