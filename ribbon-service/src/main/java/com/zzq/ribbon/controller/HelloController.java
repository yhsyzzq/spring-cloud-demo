package com.zzq.ribbon.controller;

import com.zzq.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 332406 on 2018-03-02.
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/sayHello")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }

}
