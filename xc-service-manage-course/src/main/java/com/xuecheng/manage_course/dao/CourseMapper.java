package com.xuecheng.manage_course.dao;

import com.github.pagehelper.Page;
import com.xuecheng.framework.domain.course.CourseBase;
import com.xuecheng.framework.domain.course.ext.CourseInfo;
import com.xuecheng.framework.domain.course.request.CourseListRequest;
import org.apache.ibatis.annotations.Mapper;

/**
* @name: CourseMapper
* 
* @description: 课程的mapper
* 
* @author: Yifan Zheng
*
* @Date: 2020/1/29
*
* @Version：1.0
**/
@Mapper
public interface CourseMapper {
   CourseBase findCourseBaseById(String id);
   Page<CourseInfo> findCourseListPage(CourseListRequest courseListRequest);
}


