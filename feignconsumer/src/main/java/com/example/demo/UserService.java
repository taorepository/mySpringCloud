package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2020\2\15 0015.
 */
@FeignClient(name = "service-feign-provide" , fallback = UserServiceFallBack.class)
public interface UserService {
    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
     String login();
}
