package com.lc.admin.center.service;

import org.springframework.stereotype.Service;

/**
 * 将 登陆 token，ip保存至redis，key为username,value为“token::ip” (两个冒号隔开)
 * @author: lucheng
 * @data: 2021/12/12 15:43
 * @version: 1.0
 */
@Service
public interface LoginSaveService {
}
