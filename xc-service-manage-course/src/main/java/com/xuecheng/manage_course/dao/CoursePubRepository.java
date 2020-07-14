package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.CoursePub;
import org.springframework.data.jpa.repository.JpaRepository;

/**
* @name: CoursePubRepository
*
* @description: 数据发布的dao
*
* @author: Yifan Zheng
*
* @Date: 2020/3/1
*
* @Version：1.0
**/
public interface CoursePubRepository extends JpaRepository<CoursePub,String> {
}
