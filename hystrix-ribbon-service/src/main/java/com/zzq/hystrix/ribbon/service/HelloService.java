package com.zzq.hystrix.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 332406 on 2018-03-02.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod="hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-SAYHELLO/sayHello?name=" + name, String.class);
    }

    public String hiError(String name){
        return "hi "+name+",sorry error";
    }
}
