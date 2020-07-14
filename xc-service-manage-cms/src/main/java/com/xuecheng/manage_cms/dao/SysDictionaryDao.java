package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.system.SysDictionary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
* @name: SysDictionaryDao
*
* @description: 数据字典的dao模型
*
* @author: Yifan Zheng
*
* @Date: 2020/2/12
*
* @Version：1.0
**/

public interface SysDictionaryDao extends MongoRepository<SysDictionary,String> {
    SysDictionary findBydType(String dType);
}
