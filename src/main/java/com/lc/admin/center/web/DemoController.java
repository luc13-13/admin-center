package com.lc.admin.center.web;

import com.lc.admin.center.model.UserDO;
import com.lc.admin.center.service.UserService;
import com.luc.framework.core.mvc.WebResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: lucheng
 * @data: 2021/12/11 17:56
 * @version: 1.0
 */
@Slf4j
@RestController
@RequestMapping("/customer")
public class DemoController {

    @Autowired
    private UserService userService;

    @GetMapping("/detail")
    public WebResult<UserDO> detail(@RequestParam(value = "account",required = true) Long account) {
        UserDO userDO = userService.getById (account);
        return WebResult.successData(userDO);
    }
}
