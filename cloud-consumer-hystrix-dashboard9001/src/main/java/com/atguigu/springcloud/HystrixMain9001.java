package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 *
 */
@SpringBootApplication

public class HystrixMain9001
{
    public static void main(String[] args)
    {
        SpringApplication.run(HystrixMain9001.class,args);
    }
}