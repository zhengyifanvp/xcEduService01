package com.xuecheng.framework.domain.course.ext;

import com.xuecheng.framework.domain.course.Category;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @name: CategoryNode
*
* @description: 分类节点的封装
*
* @author: Yifan Zheng
*
* @Date: 2020/2/9
*
* @Version：1.0
**/
@Data
@ToString
public class CategoryNode extends Category {

    List<CategoryNode> children;

}
