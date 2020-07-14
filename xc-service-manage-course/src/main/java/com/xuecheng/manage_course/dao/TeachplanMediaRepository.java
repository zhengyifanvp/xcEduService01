package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.TeachplanMedia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
* @name: TeachplanMediaRepository
*
* @description: 课程计划与媒资信息关联的dao
*
* @author: Yifan Zheng
*
* @Date: 2020/3/12
*
* @Version：1.0
**/
public interface TeachplanMediaRepository extends JpaRepository<TeachplanMedia,String> {
    //根据课程id查询列表
    List<TeachplanMedia> findByCourseId(String courseId);
}
