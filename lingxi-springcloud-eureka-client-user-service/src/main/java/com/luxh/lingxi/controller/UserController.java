package com.luxh.lingxi.controller;

import com.google.common.collect.Lists;
import com.luxh.common.resp.Result;
import com.luxh.lingxi.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author luxiaohua
 * @Date 2019/7/11
 */

@RestController
public class UserController {

    @GetMapping("/users")
    public Result getUsers() {
        List<User> userList = Lists.newArrayList();
        userList.add(new User(1L, "lihuai"));
        userList.add(new User(2l, "yekai"));
        userList.add(new User(3L, "chuliuxiang"));
        return Result.success(userList);
    }
}
