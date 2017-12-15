package com.dzpykj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ConfigclientApplication {

	@Value("${configClientKey}")
    String configClientKey;
	
    @RequestMapping(value = "/getConf")
    public String getConf(){
        return configClientKey;
    }
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}
}
