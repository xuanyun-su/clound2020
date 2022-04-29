package com.atguigu.springcloud;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableEurekaClient
public class OrderMain80
{
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}

