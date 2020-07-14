package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.ext.CategoryNode;
import org.apache.ibatis.annotations.Mapper;

/**
* @name: CategoryMapper
*
* @description: 课程分类的Mapper
*
* @author: Yifan Zheng
*
* @Date: 2020/2/9
*
* @Version：1.0
**/
@Mapper
public interface CategoryMapper {
    //查询分类
    public CategoryNode selectList();
}
