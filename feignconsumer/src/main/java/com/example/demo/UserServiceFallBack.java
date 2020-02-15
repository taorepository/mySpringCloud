package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2020\2\15 0015.
 */
@Component
public class UserServiceFallBack implements UserService{
    @Override
    public String login() {
        System.out.println("jinlai le ");
        return "login方法报错了";
    }
}
