package com.luxh.lingxi.feign;


import com.luxh.common.resp.Result;
import com.luxh.common.resp.Status;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserFeignServiceTest {

    @Autowired
    private UserFeignService userFeignService;

    @Test
    public void getById() {
        Result result = userFeignService.getById(10L);
        Assert.assertEquals(Status.OK.getCode(), result.getCode());
    }
}