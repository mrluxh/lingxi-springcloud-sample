package com.luxh.lingxi.feign;

import com.luxh.common.resp.Result;
import com.luxh.common.resp.Status;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author luxiaohua
 * @Date 2019/7/12
 */
@Component
public class OrderFeignServiceFallback implements OrderFeignService {
    @Override
    public Result getOrderByUserId(Long userId) {
        return Result.fail(Status.SERVER_ERROR.getCode(), "订单服务异常");
    }
}
