package com.luxh.lingxi.controller;

import com.luxh.common.resp.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 订单
 * @Author luxiaohua
 * @Date 2019/7/11
 */
@RestController
public class OrderController {


    @GetMapping("/orders")
    public Result orders() {

        return null;
    }
}
