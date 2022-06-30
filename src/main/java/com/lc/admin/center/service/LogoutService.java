package com.lc.admin.center.service;

import com.lc.admin.center.model.UserDO;


/**
 * @author: lucheng
 * @data: 2022/2/22 16:57
 * @version: 1.0
 */
public interface LogoutService {
    void logoutAndClean(UserDO record);
}
