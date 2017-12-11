package com.dzpykj.hystrixService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dzpykj.feignInterface.HelloInterface;

@Component
public class HystrixErrorFallBack implements HelloInterface {

	@Value("${server.port}")
	String port;
	
	@Override
	public String hello(String name) {
		return "Sorry "+name+",when you are visting feign hystrix project,port:"+port+",you meet an error";
	}

}
