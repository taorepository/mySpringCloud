package com.example.demo.controller;

import com.example.demo.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Administrator on 2020\2\15 0015.
 */
@RestController
public class UserServiceController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login")
    public String login() {
        System.out.println("-------------");
        System.out.println(userService);
        return userService.login();
    }
    @RequestMapping(value = "/login2")
    public String login2() {
        return "login2";
    }
}
