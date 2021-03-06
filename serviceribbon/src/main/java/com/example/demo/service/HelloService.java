package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2020\2\8 0008.
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    public String hiService(String name)
    {
        return restTemplate.getForObject("http://SERVICE-RIBBON/hi?name=" + name, String.class);
    }
}
