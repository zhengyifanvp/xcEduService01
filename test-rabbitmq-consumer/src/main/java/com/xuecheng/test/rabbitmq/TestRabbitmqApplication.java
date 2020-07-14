package com.xuecheng.test.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @name: TestRabbitmqApplication
*
* @description: 试Rabbitmq消费者的启动类
*
* @author: Yifan Zheng
*
* @Date: 2020/1/19
*
* @Version：1.0
**/
@SpringBootApplication
public class TestRabbitmqApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestRabbitmqApplication.class,args);
    }
}
