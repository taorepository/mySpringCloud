package com.example.demo.controller;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.jms.Destination;

/**
 * Created by Administrator on 2020\2\10 0010.
 */
@RestController
public class PublisherController {
    @Resource
    JmsMessagingTemplate jmsMessagingTemplate;
    @RequestMapping("publish")
    public void publish(String name){
        Destination destination =  new ActiveMQTopic("test.topic2");
        jmsMessagingTemplate.convertAndSend(destination,name);
    }
}
