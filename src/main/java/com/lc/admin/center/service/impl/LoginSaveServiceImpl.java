package com.lc.admin.center.service.impl;

import com.lc.admin.center.service.LoginSaveService;
import com.lc.admin.center.util.RedisUtils;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author: lucheng
 * @data: 2021/12/30 22:33
 * @version: 1.0
 */
@Service
public class LoginSaveServiceImpl implements LoginSaveService {

    private final RedisUtils redisUtils;

    public LoginSaveServiceImpl(RedisUtils redisUtils) {
        this.redisUtils = redisUtils;
    }

    @Override
    public void save(String username, String ip) {
        // 将username和ip存在redis中，默认过期时间为一星期
        redisUtils.set(username,ip,10000);
    }
}
