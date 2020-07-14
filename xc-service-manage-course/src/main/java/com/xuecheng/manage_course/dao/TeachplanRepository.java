package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.Teachplan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
* @name: TeachplanRepository
*
* @description: 采用jpa
*
* @author: Yifan Zheng
*
* @Date: 2020/1/29
*
* @Version：1.0
**/
public interface TeachplanRepository extends JpaRepository<Teachplan,String> {

    //根据课程id和parentid查询teachplan，SELECT * FROM teachplan a WHERE a.courseid ='4028e581617f945f01617f9dabc40000' AND a.parentid='0'
    public List<Teachplan> findByCourseidAndParentid(String courseId, String parentId);
}
