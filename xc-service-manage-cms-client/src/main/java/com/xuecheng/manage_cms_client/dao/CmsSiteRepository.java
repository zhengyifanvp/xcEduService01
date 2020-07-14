package com.xuecheng.manage_cms_client.dao;


import com.xuecheng.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
* @name: CmsSiteRepository
* 
* @description: 
* 
* @author: Yifan Zheng
*
* @Date: 2020/1/20
*
* @Version：1.0
**/
public interface CmsSiteRepository extends MongoRepository<CmsSite,String> {
}
