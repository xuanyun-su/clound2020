package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException e){
        return new CommonResult(200,"按客户自定义,gloabl handlerException-------1");
    }
    public static CommonResult handlerException2(BlockException e){
        return new CommonResult(200,"按客户自定义,gloabl handlerException -----2");
    }
}
