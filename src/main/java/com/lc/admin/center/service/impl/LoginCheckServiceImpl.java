package com.lc.admin.center.service.impl;

import com.lc.admin.center.service.LoginCheckService;
import com.lc.admin.center.util.StringModUtils;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import lombok.extern.slf4j.Slf4j;

/**
 * 用于校验登陆用户名和ip地址, 用户名username和邮箱email字符串必须满足规定格式(见StringModUtils中)
 * @author: lucheng
 * @data: 2021/12/12 15:48
 * @version: 1.0
 */
@Service
@Slf4j
public class LoginCheckServiceImpl implements LoginCheckService {

    @Override
    public boolean check(String userName, String ip) {
        if(StringModUtils.validateEnglish(userName)) {
            log.info("校验成功,登陆方式为用户名登陆");
            return true;
        } else if (StringModUtils.validateEmail(userName)) {
            log.info("校验成功，登陆方式为邮箱登陆");
            return true;
        }
        return false;
    }
}
