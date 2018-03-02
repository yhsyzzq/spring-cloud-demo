package com.zzq.hystrix.feign.controller;

import com.zzq.hystrix.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 332406 on 2018-03-02.
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
