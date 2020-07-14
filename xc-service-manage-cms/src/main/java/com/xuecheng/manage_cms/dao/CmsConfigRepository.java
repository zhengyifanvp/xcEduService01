package com.xuecheng.manage_cms.dao;


import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
* @name: CmsConfigRepository
*
* @description: CmsConfig的数据模型
*
* @author: Yifan Zheng
*
* @Date: 2020/1/16
*
* @Version：1.0
**/
public interface CmsConfigRepository extends MongoRepository<CmsConfig,String> {
}
