package com.lc.admin.center.web;

import com.luc.framework.core.mvc.WebResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lucheng
 * @data: 2022/4/29 14:03
 * @version: 1.0
 */
@RestController
@RequestMapping("/register")
public class RegisterController {

    @GetMapping("/register")
    public WebResult<String> baseRegister() {

        return WebResult.successData("注册测试");
    }
}
