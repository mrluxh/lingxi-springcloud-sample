package com.luxh.lingxi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description TODO
 * @Author luxiaohua
 * @Date 2019/7/11
 */

@Data
@AllArgsConstructor
public class Order {

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 订单金额
     */
    private BigDecimal amount;

    /**
     * 用户id
     */
    private Long userId;
}
