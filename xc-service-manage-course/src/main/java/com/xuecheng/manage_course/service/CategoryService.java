package com.xuecheng.manage_course.service;

import com.xuecheng.framework.domain.course.ext.CategoryNode;
import com.xuecheng.manage_course.dao.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @name: CategoryService
*
* @description: 课程分类
*
* @author: Yifan Zheng
*
* @Date: 2020/2/9
*
* @Version：1.0
**/
@Service
public class CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    //查询分类
    public CategoryNode findList(){
        return categoryMapper.selectList();
    }
}
