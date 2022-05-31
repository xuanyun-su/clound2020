package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFailbackService implements PaymentHystrixService{
    @Override

    public String paymentInfo_OK(Integer id) {
        return "---PaymentFailbackService fallback-paymentInfo_OK, gun";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "---PaymentFailbackService fallback-paymentInfo_TimeOut, gun";
    }
}
