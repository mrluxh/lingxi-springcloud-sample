package com.luxh.lingxi.feign;

import com.luxh.common.resp.Result;
import com.luxh.common.resp.Status;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author luxiaohua
 * @Date 2019/7/12
 */

@Component
public class UserFeignServiceFallback implements UserFeignService {

    @Override
    public Result getById(Long userId) {
        return Result.fail(Status.SERVER_ERROR.getCode(), "用户服务异常");
    }
}
