package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.CourseTeacherinfo;
import org.springframework.data.jpa.repository.JpaRepository;
/**
* @name: CourseTeacherinfoRepository
*
* @description: 课程老师的基本信息
*
* @author: Yifan Zheng
*
* @Date: 2020/1/29
*
* @Version：1.0
**/
public interface CourseTeacherinfoRepository extends JpaRepository<CourseTeacherinfo,String> {
}
