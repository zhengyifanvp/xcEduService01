package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.CourseBase;
import org.springframework.data.jpa.repository.JpaRepository;

/**
* @name: CourseBaseRepository
* 
* @description: 课程基本信息的仓库
* 
* @author: Yifan Zheng
*
* @Date: 2020/1/29
*
* @Version：1.0
**/
public interface CourseBaseRepository extends JpaRepository<CourseBase,String> {
}
