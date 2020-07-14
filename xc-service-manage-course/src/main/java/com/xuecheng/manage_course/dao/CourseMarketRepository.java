package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.CourseMarket;
import org.springframework.data.jpa.repository.JpaRepository;
/**
* @name: CourseMarketRepository
*
* @description: 课程营销信息
*
* @author: Yifan Zheng
*
* @Date: 2020/2/13
*
* @Version：1.0
**/
public interface CourseMarketRepository extends JpaRepository<CourseMarket, String>  {
}
