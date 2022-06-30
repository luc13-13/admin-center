package com.lc.admin.center.web.user;

import com.lc.admin.center.model.UserDO;
import com.lc.admin.center.service.UserService;
import com.luc.framework.core.mvc.WebResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lucheng
 * @data: 2022/4/28 23:16
 * @version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("get")
    public WebResult<UserDO> test(@PathVariable long id) {

        return WebResult.successData(userService.getById(id));
    }



}
