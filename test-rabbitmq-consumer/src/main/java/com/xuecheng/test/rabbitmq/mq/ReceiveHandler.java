package com.xuecheng.test.rabbitmq.mq;

import com.rabbitmq.client.Channel;
import com.xuecheng.test.rabbitmq.config.RabbitmqConfig;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
* @name: ReceiveHandler
*
* @description: 接收端 消费者
*
* @author: Yifan Zheng
*
* @Date: 2020/1/19
*
* @Version：1.0
**/
@Component
public class ReceiveHandler {

    @RabbitListener(queues = {RabbitmqConfig.QUEUE_INFORM_EMAIL})
    public void send_email(String msg,Message message,Channel channel){
        System.out.println("receive message is:"+msg);
    }

}
