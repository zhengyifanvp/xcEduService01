package com.xuecheng.filesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
* @name: FileSystemApplication
*
* @description: 文件系统服务的启动类
*
* @author: Yifan Zheng
*
* @Date: 2020/2/14
*
* @Version：1.0
**/
@SpringBootApplication//扫描所在包及子包的bean，注入到ioc中
@EnableDiscoveryClient//开启eureka发现注册
@EntityScan("com.xuecheng.framework.domain.filesystem")//扫描实体类
@ComponentScan(basePackages={"com.xuecheng.api"})//扫描接口
@ComponentScan(basePackages={"com.xuecheng.framework"})//扫描framework中通用类
@ComponentScan(basePackages={"com.xuecheng.filesystem"})//扫描本项目下的所有类
public class FileSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(FileSystemApplication.class,args);
    }


}
