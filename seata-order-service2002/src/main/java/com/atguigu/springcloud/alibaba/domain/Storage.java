package com.atguigu.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @author Chengzhi Li
 * @date 2022/9/16 22:18 星期五
 */

@Data
public class Storage {

    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;


    //已用库存
    private Integer used;


    //剩余库存
    private Integer residue;
}
