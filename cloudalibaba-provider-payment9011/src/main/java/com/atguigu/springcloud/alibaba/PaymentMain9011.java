package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Chengzhi Li
 * @date 2022/9/9 20:30 星期五
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9011 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9011.class,args);
    }
}