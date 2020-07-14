package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;
/**
* @name: CmsPageRepositoryTest
*
* @description: 测试cmsPage
*
* @author: Yifan Zheng
*
* @Date: 2020/1/10
*
* @Version：1.0
**/
@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsPageRepositoryTest {
    @Autowired
    CmsPageRepository cmsPageRepository;

    @Test
    public void testFindAll(){
        List<CmsPage> all = cmsPageRepository.findAll();
        System.out.println(all);
    }

    @Test
    public void testFindPage(){
        //分页参数
        int page = 1;
        int size = 10;
        Pageable pageable = PageRequest.of(page, size);
        Page<CmsPage> all = cmsPageRepository.findAll(pageable);
        System.out.println("all = " + all);
    }
    //自定义条件查询测试
    @Test
    public void testFindAllByExample(){
        //分页参数
        int page = 0;
        int size = 10;
        Pageable pageable = PageRequest.of(page, size);

        //条件值对象
        CmsPage cmsPage = new CmsPage();
        //查询站点
        //cmsPage.setSiteId("5a751fab6abb5044e0d19ea1");
        //模糊查询名字
        cmsPage.setPageAliase("轮");
        //条件匹配器
        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
        exampleMatcher = exampleMatcher.withMatcher("pageAliase", ExampleMatcher.GenericPropertyMatchers.contains());
        //定义example
        Example<CmsPage> example = Example.of(cmsPage,exampleMatcher);
        Page<CmsPage> all = cmsPageRepository.findAll(example, pageable);
        List<CmsPage> content = all.getContent();
        System.out.println("content = " + content);

    }

    //修改
    @Test
    public void testUpdate(){
        //查询对象
        Optional<CmsPage> optional = cmsPageRepository.findById("");
        if(optional.isPresent()){
            CmsPage cmsPage = optional.get();
            //设置要修改的直
            cmsPage.setPageName("");
            //....
            //修改
            CmsPage save = cmsPageRepository.save(cmsPage);
            System.out.println("save = " + save);

        }
    }
    //根据页面名称查
    @Test
    public void testfindByPageName(){
        CmsPage cmsPage = cmsPageRepository.findByPageName("index.html");
        System.out.println("cmsPage = " + cmsPage);

    }
}
