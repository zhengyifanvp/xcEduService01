package com.xuecheng.test.freemarker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
* @name: testRestTemplate
*
* @description: 测试restTemplate
*
* @author: Yifan Zheng
*
* @Date: 2020/1/16
*
* @Version：1.0
**/
@SpringBootTest
@RunWith(SpringRunner.class)
public class testRestTemplate {
    @Autowired
    RestTemplate restTemplate;
    @Test
    public void testRestTemplate(){
        ResponseEntity<Map> forEntity = restTemplate.getForEntity("http://localhost:31001/cms/page/get/5a754adf6abb500ad05688d9", Map.class);
        System.out.println(forEntity);
    }
}
