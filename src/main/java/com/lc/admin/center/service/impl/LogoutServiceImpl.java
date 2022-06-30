package com.lc.admin.center.service.impl;

import com.lc.admin.center.config.ShiroRealm;
import com.lc.admin.center.model.UserDO;
import com.lc.admin.center.service.LogoutService;
import com.lc.admin.center.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: lucheng
 * @data: 2022/2/22 16:57
 * @version: 1.0
 */
@Service
@Slf4j
public class LogoutServiceImpl implements LogoutService {
    @Autowired
    private RedisUtils redisUtils;
    @Override
    public void logoutAndClean(UserDO record) {
        String key = ShiroRealm.class.getName() + "::" + "logout::" + record.getLoginName();
        redisUtils.expired(key);
    }
}
