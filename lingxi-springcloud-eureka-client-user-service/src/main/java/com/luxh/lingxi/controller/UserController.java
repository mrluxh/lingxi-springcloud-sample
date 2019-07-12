package com.luxh.lingxi.controller;

import com.luxh.common.resp.Result;
import com.luxh.lingxi.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author luxiaohua
 * @Date 2019/7/11
 */

@RestController
public class UserController {



    @GetMapping("/users/{userId}")
    public Result<User> getById(@PathVariable("userId") Long userId) {
        User user = new User(userId, "lihuai");
        return Result.success(user);
    }
}
