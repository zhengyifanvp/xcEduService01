package com.xuecheng.framework.model.response;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @name: QueryResult
* 
* @description: 
* 
* @author: Yifan Zheng
*
* @Date: 2020/1/19
*
* @Version：1.0
**/
@Data
@ToString
public class QueryResult<T> {
    //数据列表
    private List<T> list;
    //数据总数
    private long total;
}
