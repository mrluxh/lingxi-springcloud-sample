package com.luxh.lingxi.feign;

import com.luxh.common.resp.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description 用户服务feign接口
 * @Author luxiaohua
 * @Date 2019/7/12
 */
@Component
@FeignClient(value = "user-service", fallback = UserFeignServiceFallback.class)
public interface UserFeignService {

    @GetMapping("/users/{userId}")
    Result getById(@PathVariable("userId") Long userId);
}
