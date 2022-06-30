package com.lc.admin.center.config;

import com.alibaba.fastjson.JSONObject;
import com.lc.admin.center.condition.MyShiroProperties;
import com.lc.admin.center.condition.ShiroProperties;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: lucheng
 * @data: 2022/2/28 23:01
 * @version: 1.0
 */
@Configuration(proxyBeanMethods = false)
@Slf4j
@DependsOn("applicationContextHolder")
public class ShiroEarlyBeanConfig {
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(@Lazy DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Lazy DefaultWebSecurityManager securityManager,
                                                         @Lazy MyShiroProperties myShiroProperties) {
//        ShiroProperties shiro = myShiroProperties.getShiroProperties();
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // 设置 securityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        // 登录的 url
        shiroFilterFactoryBean.setLoginUrl("/**/login");
        // 登录成功后跳转的 url
        shiroFilterFactoryBean.setSuccessUrl("/index");
        // 未授权 url
        shiroFilterFactoryBean.setUnauthorizedUrl("/unauthorized");
        // 设置免认证 url
        LinkedHashMap<String, String> filterChainDefinitionMap;
        String[] anonUrls = StringUtils.splitByWholeSeparatorPreserveAllTokens(
                "/test/**,/febs/**,/img/**,/layui/**,/json/**,/images/captcha,/**/register",
                ",");
        filterChainDefinitionMap = Arrays.stream(anonUrls).collect(Collectors.toMap(url -> url, url -> "anon", (a, b) -> b, LinkedHashMap::new));
        // 配置退出过滤器，其中具体的退出代码 Shiro已经替我们实现了
        filterChainDefinitionMap.put("/logout", "logout");
        // 除上以外所有 url都必须认证通过才可以访问，未通过认证自动访问 LoginUrl
        filterChainDefinitionMap.put("/**", "user");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }
}
