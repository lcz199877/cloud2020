package com.atguigu.springcloud.alibaba.service;

/**
 * @author Chengzhi Li
 * @date 2022/9/16 22:24 星期五
 */
public interface StorageService {

    // 扣减库存
    void decrease(Long productId, Integer count);
}