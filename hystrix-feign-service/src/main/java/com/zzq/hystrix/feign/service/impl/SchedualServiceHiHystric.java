package com.zzq.hystrix.feign.service.impl;

import com.zzq.hystrix.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 332406 on 2018-03-02.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "hi "+name+",sorry,error";
    }
}
