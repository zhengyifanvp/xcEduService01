package com.xuecheng.manage_cms.controller;

import com.xuecheng.api.cms.SysDicthinaryControllerApi;
import com.xuecheng.framework.domain.system.SysDictionary;
import com.xuecheng.manage_cms.service.SysdictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @name: SysDictionaryController
*
* @description: 数据字典的controller
*
* @author: Yifan Zheng
*
* @Date: 2020/2/12
*
* @Version：1.0
**/
@RestController
@RequestMapping("/sys/dictionary")
public class SysDictionaryController implements SysDicthinaryControllerApi {

    @Autowired
    SysdictionaryService sysdictionaryService;


    @Override
    @GetMapping("/get/{type}")
    public SysDictionary getByType(@PathVariable String type) {
        return sysdictionaryService.findDictionaryByType(type);
    }
}
