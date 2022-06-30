package com.lc.admin.center.condition;

import com.lc.admin.center.util.ApplicationContextHolder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author: lucheng
 * @data: 2022/2/28 21:43
 * @version: 1.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "my-shiro")
@DependsOn("shiroProperties")
public class MyShiroProperties {

    public static String PREFIX = "my-shiro";
    public static String ENABLE_REDIS_CACHE = "my-shiro.shiro.enable-redis-cache";

    private String maxBatchInsertNum;

    private ShiroProperties shiroProperties;

    public static String getPREFIX() {
        return PREFIX;
    }

    public static String getEnableRedisCache() {
        return ENABLE_REDIS_CACHE;
    }

    public String getMaxBatchInsertNum() {
        return maxBatchInsertNum;
    }

    public void setMaxBatchInsertNum(final String maxBatchInsertNum) {
        this.maxBatchInsertNum = maxBatchInsertNum;
    }

    public ShiroProperties getShiroProperties() {
        return shiroProperties;
    }

    public void setShiroProperties(final ShiroProperties shiroProperties) {
        this.shiroProperties = shiroProperties;
    }
}
