package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Chengzhi Li
 * @date 2022/9/16 22:21 星期五
 */
@Mapper
public interface StorageDao {


    //扣减库存信息
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}