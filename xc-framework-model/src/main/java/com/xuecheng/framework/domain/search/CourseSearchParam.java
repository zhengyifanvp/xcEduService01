package com.xuecheng.framework.domain.search;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
* @name: CourseSearchParam
*
* @description: 综合查询条件的数据模型
*
* @author: Yifan Zheng
*
* @Date: 2020/3/1
*
* @Version：1.0
**/
@Data
@ToString
public class CourseSearchParam implements Serializable {
    //关键字
    String keyword;
    //一级分类
    String mt;
    //二级分类
    String st;

    //难度等级
    String grade;

    //价格区间
    Float price_min;
    Float price_max;

    //排序字段
    String sort;
    //过虑字段
    String filter;

}
