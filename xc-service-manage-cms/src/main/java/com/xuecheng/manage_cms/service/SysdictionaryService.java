package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.system.SysDictionary;
import com.xuecheng.manage_cms.dao.SysDictionaryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @name: SysdictionaryService
*
* @description: 数据字典---字典分类type查询字典信息
*
* @author: Yifan Zheng
*
* @Date: 2020/2/12
*
* @Version：1.0
**/
@Service
public class SysdictionaryService {
    @Autowired
    SysDictionaryDao sysDictionaryDao;

    public SysDictionary findDictionaryByType(String type){
        /**
        * @methodName: findDictionaryByType
        * @Description: 字典分类type查询字典信息
        * @Param: [type]
        * @return: com.xuecheng.framework.domain.system.SysDictionary
        * @Author: Yifan Zheng
        * @Date: 2020/2/12
        */
        return sysDictionaryDao.findBydType(type);
    }
}
