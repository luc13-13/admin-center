package com.lc.admin.center.util;

import com.google.common.base.Objects;

import com.alibaba.fastjson.JSONObject;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

/**
 * @author: lucheng
 * @data: 2022/4/29 2:06
 * @version: 1.0
 */
@Service
@Lazy(false)
public class ApplicationContextHolder implements ApplicationContextAware {
    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextHolder.applicationContext = applicationContext;
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBeanByName(String name){
        return (T) applicationContext.getBean(name);
    }

    @SuppressWarnings("checked")
    public static <T> T getBeanByName(Class<T> clz) {
        checkApplicationContext();
        Map beanMaps = applicationContext.getBeansOfType(clz);
        if(beanMaps != null && !beanMaps.isEmpty()) {
            return (T) beanMaps.values().iterator().next();
        } else return null;

    }


    private static void checkApplicationContext() {
        if (applicationContext == null) {
            throw new IllegalStateException("applicaitonContext未注入，请在applicationContext.xml中定义SpringContextHolder");
        }
    }
}
