package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * @author Chengzhi Li
 * @date 2022/9/15 9:32 星期四
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"按客戶自定义 globle BlockException---1 ");
    }
    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按客戶自定义 globle BlockException---2 ");
    }
}
