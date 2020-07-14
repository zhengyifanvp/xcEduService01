package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import org.apache.ibatis.annotations.Mapper;

/**
* @name: TeachplanMapper
*
* @description: //课程计划查询的mapper 采用mybatis
*
* @author: Yifan Zheng
*
* @Date: 2020/1/29
*
* @Version：1.0
**/
@Mapper
public interface TeachplanMapper {
    //课程计划查询
    public TeachplanNode selectList(String courseId);
}
