package com.pan.cloud.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description: 用Spring Boot创建一个服务类EurekaServerApplication，需要一个注解@EnableEurekaServer加在springboot工程的启动类上
 * Time:2019/2/11
 *
 * @author pan
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakaApplication {
    public static void main(String[] args) {
    	type name = new type();
    	
        SpringApplication.run(EurakaApplication.class);
        
        type name2 = new type();
        
    }
}
