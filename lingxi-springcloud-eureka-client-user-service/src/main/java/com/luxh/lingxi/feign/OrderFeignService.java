package com.luxh.lingxi.feign;

import com.luxh.common.resp.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description 订单feign服务
 * @Author luxiaohua
 * @Date 2019/7/12
 */

@Component
@FeignClient(value = "order-service", fallback = OrderFeignServiceFallback.class)
public interface OrderFeignService {

    /**
     * 根据用户查询订单
     * @param userId 用户id
     * @return
     */
    @GetMapping("/orders")
    Result getOrderByUserId(@RequestParam Long userId);
}
