package com.xuecheng.manage_course;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.manage_course.client.CmsPageClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
* @name: TestDao
*
* @description: feign远程调用的测试
*
* @author: Yifan Zheng
*
* @Date: 2020/2/22
*
* @Version：1.0
**/
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestFeign {
    @Autowired
    CmsPageClient cmsPageClient;//接口代理对象 有feign生成
    @Test
    public void testFeign(){
        CmsPage page = cmsPageClient.findCmsPageById("5a754adf6abb500ad05688d9");
        System.out.println("page = " + page);

    }

}
