package com.lc.admin.center.config;

import com.lc.admin.center.bo.UserBO;
import com.lc.admin.center.convertor.UserConvertor;
import com.lc.admin.center.model.UserDO;
import com.lc.admin.center.service.LogoutService;
import com.lc.admin.center.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

/**
 * @author: lucheng
 * @data: 2022/2/22 14:02
 * @version: 1.0
 * 重写Shiro的AuthorizingRealm，实现自己的用户-权限(User-Permission)绑定实体
 */
@Component
@RequiredArgsConstructor
public class ShiroRealm extends AuthorizingRealm {

    private final UserService userService;
    private final LogoutService logoutService;
    private final UserConvertor userConvertor;


    /**
     * 用户授权模块，获取用户的权限信息
     * @param principalCollection
     * @return AuthorizationInfo 用户拥有的权限信息
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        UserDO userDO = (UserDO) principalCollection.getPrimaryPrincipal();
        UserBO userBO = userConvertor.convertDO2BO(userDO);
        // 获取用户角色Role和权限Permission集合
        userService.doGetUserAuthorizationInfo(userBO);

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(userBO.getRoles());
        simpleAuthorizationInfo.setStringPermissions(userBO.getPermissions());
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // 从token中获取用户名和密码
        String username = (String) token.getPrincipal();
        String pwd = new String((char[]) token.getCredentials());

        UserBO record = userService.findByLoginName(username);
        //校验用户是否在库中、密码是否正确
        if(record == null || !StringUtils.equals(pwd, record.getPwd())) {
            throw new IncorrectCredentialsException("用户名或密码错误！");
        }
        if(record.getInvalid() == 0) {
            throw new LockedAccountException("账号失效，请联系管理员");
        }
        return new SimpleAuthenticationInfo(record, pwd, getName());
    }

    @Override
    public void onLogout(PrincipalCollection principals) {
        super.onLogout(principals);
        UserDO record = (UserDO) principals.getPrimaryPrincipal();
        logoutService.logoutAndClean(record);
    }
}
