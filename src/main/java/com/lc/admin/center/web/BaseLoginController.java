package com.lc.admin.center.web;

import com.lc.admin.center.service.LoginCheckService;
import com.lc.admin.center.service.LoginSaveService;
import com.lc.admin.center.util.Md5Utils;
import com.lc.admin.center.util.RedisUtils;
import com.lc.admin.center.web.request.LoginRequest;
import com.luc.framework.core.mvc.WebResult;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: lucheng
 * @data: 2021/12/12 15:51
 * @version: 1.0
 */
@Slf4j
@RestController
@RequestMapping("baseLogin")
public class BaseLoginController {
    private final LoginCheckService loginCheck;
    private final LoginSaveService loginSave;

    public BaseLoginController(LoginCheckService loginCheck, LoginSaveService loginSave) {
        this.loginCheck = loginCheck;
        this.loginSave = loginSave;
    }

    @PostMapping("login")
    public WebResult<String> login(@RequestBody(required = true)LoginRequest loginRequest,
                                   HttpServletRequest request) {

        //TODO 验证码服务，如果有验证码的话，校验loginRequest中的verifyCode是否正确
        String nameSource = loginRequest.getUserName().toLowerCase();
        log.info("------进入登录校验------用户名:{}  sessionID:{}",nameSource,request.getRequestedSessionId());
        loginCheck.check(nameSource, request.getRequestedSessionId());
        String pwd = Md5Utils.encrypt(nameSource, loginRequest.getPwd().toLowerCase());

        UsernamePasswordToken token = new UsernamePasswordToken(nameSource, pwd);
        token.setRememberMe(new Integer(1).equals(loginRequest.getRemember()));
        SecurityUtils.getSubject().login(token);
            // 根据username和加密后的生成token
        loginSave.save(nameSource, request.getRemoteAddr());
        return WebResult.successData("登陆成功！");
    }
}
