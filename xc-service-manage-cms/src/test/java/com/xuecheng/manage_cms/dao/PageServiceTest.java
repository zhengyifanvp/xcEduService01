package com.xuecheng.manage_cms.dao;

import com.xuecheng.manage_cms.service.PageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
* @name: PageServiceTest
*
* @description: 测试pageService中页面静态化程序
*
* @author: Yifan Zheng
*
* @Date: 2020/1/17
*
* @Version：1.0
**/
@SpringBootTest
@RunWith(SpringRunner.class)
public class PageServiceTest {

    @Autowired
    PageService pageService;

    @Test
    public void testGetPageHtml(){
        String pageHtml = pageService.getPageHtml("5e1c3108115f6f3488049e50");
        System.out.println(pageHtml);

    }

}
