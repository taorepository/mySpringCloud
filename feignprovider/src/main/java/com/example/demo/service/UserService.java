package com.example.demo.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020\2\15 0015.
 */
@RestController
public class UserService {
    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public String login(){
        return "login success";
    }
}
