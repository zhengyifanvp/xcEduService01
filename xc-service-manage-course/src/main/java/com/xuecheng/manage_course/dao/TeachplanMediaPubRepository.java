package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.TeachplanMediaPub;
import org.springframework.data.jpa.repository.JpaRepository;

/**
* @name: TeachplanMediaPubRepository
*
* @description:
*
* @author: Yifan Zheng
*
* @Date: 2020/3/14
*
* @Version：1.0
**/
public interface TeachplanMediaPubRepository extends JpaRepository<TeachplanMediaPub,String> {
    //根据课程id删除记录
    long deleteByCourseId(String courseId);
}
