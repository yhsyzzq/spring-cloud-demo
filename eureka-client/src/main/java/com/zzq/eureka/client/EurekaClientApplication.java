package com.zzq.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注册服务客户端
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {

	@Value("${server.port}")
	String port;

	@RequestMapping("/sayHello")
	public String home(@RequestParam String name) {
		return "hello "+name+",I am from port:" +port;
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
