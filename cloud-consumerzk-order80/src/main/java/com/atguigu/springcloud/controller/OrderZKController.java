package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author Chengzhi Li
 * @date 2022/8/30 21:46 星期二
 */
@RestController
@Slf4j
public class OrderZKController {
    public static final String INVOME_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String payment(){
        String result = restTemplate.getForObject(INVOME_URL+"/payment/zk",String.class);
        return result;

    }

}
