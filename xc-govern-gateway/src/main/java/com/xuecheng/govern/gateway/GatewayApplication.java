package com.xuecheng.govern.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
* @name: GatewayApplication
*
* @description: 网关启动类
*
* @author: Yifan Zheng
*
* @Date: 2020/3/21
*
* @Version：1.0
**/
@SpringBootApplication
@EnableZuulProxy//此工程是一个zuul网关
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
