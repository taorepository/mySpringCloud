package com.example.demo.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2020\2\9 0009.
 */
@Service
public class Consumer {
    @JmsListener(destination = "test.queue")
    public void receiveMsg(String text){

    }
}
