package com.zzq.hystrix.feign.service;

import com.zzq.hystrix.feign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 332406 on 2018-03-02.
 */
@FeignClient(value = "service-sayHello", fallback = SchedualServiceHiHystric.class)
@Service
public interface SchedualServiceHi {

    @RequestMapping("/sayHello")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
