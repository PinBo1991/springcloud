package com.dzpykj.feignInterface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dzpykj.hystrixService.HystrixErrorFallBack;

@FeignClient(value = "eurekaclient",fallback = HystrixErrorFallBack.class) //value为要负载均衡的spring.application.name
public interface HelloInterface {
	
	@RequestMapping("/hi") //负载均衡目标工程里面的哪个方法
	public String hello(@RequestParam(value="name") String name);
}
