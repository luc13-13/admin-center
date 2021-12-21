package com.lc.admin.center.service;

/**
 * 1、检查userName和验证码是否合法；2、
 * @author: lucheng
 * @data: 2021/12/12 15:31
 * @version: 1.0
 */
public interface LoginCheckService {
    /**
     * 校验登陆名 和 ip地址
     * @param userName
     * @param ip
     * @return
     */
    boolean check(String userName, String ip);
}
