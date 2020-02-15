package com.example.demo.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;

/**
 * Created by Administrator on 2020\2\9 0009.
 */
@Configuration
public class BeanConfig {
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("test.queue");
    }
    @Bean(name="myJmsContainerFactory")
    public JmsListenerContainerFactory myJmsContainer(ConnectionFactory connectionFactory){
        SimpleJmsListenerContainerFactory simpleJmsListenerContainerFactory = new SimpleJmsListenerContainerFactory();
        simpleJmsListenerContainerFactory.setConnectionFactory(connectionFactory);
        simpleJmsListenerContainerFactory.setPubSubDomain(true);
        return simpleJmsListenerContainerFactory;
    }
}
