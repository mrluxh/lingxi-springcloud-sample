package com.luxh.lingxi.controller;

import com.google.common.collect.Lists;
import com.luxh.common.resp.Result;
import com.luxh.lingxi.feign.UserFeignService;
import com.luxh.lingxi.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description 订单
 * @Author luxiaohua
 * @Date 2019/7/11
 */
@RestController
public class OrderController {

    @Autowired
    private UserFeignService userFeignService;

    /**
     * 根据用户id查询订单
     * @param userId
     * @return
     */
    @GetMapping("/orders")
    public Result<List<Order>> getByUserId(@RequestParam Long userId) {
        List<Order> orderList = Lists.newArrayList();
        orderList.add(new Order(1000L, new BigDecimal("100.00"), userId));
        orderList.add(new Order(2000L, new BigDecimal("200.00"), userId));

        // 查询用户信息
        // userFeignService.getById(userId);

        return Result.success(orderList);
    }






}
