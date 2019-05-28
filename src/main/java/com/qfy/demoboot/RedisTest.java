package com.qfy.demoboot;

import com.qfy.demoboot.util.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisTest {

    @Resource
    private RedisUtils redisUtils;

    @Test
    public void set(){
        redisUtils.set("redis_key","Test");
    }

    @Test
    public void get(){
        String value = redisUtils.get("redis_key");
        System.out.println(value);
    }
}
