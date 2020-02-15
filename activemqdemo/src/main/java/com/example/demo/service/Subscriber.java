package com.example.demo.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2020\2\10 0010.
 */
@Service
public class Subscriber {

    @JmsListener(destination = "test.topic2" , containerFactory = "myJmsContainerFactory")
    public void subscriber(){

    }
}
