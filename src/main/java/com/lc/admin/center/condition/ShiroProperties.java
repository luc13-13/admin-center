package com.lc.admin.center.condition;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author: lucheng
 * @data: 2022/2/28 22:19
 * @version: 1.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "my-shiro.shiro")
//@DependsOn("applicationContextHolder")
public class ShiroProperties {
    @DurationUnit(ChronoUnit.SECONDS)
    private Duration sessionTimeout;

    private Boolean enableRedisCache;

    private String loginUrl;

    private String successUrl;

    private String unauthorizedUrl;

    private String logoutUrl;

    private String anonUrl;

    public Duration getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Duration sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public Boolean getEnableRedisCache() {
        return enableRedisCache;
    }

    public void setEnableRedisCache(Boolean enableRedisCache) {
        this.enableRedisCache = enableRedisCache;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getSuccessUrl() {
        return successUrl;
    }

    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }

    public String getUnauthorizedUrl() {
        return unauthorizedUrl;
    }

    public void setUnauthorizedUrl(String unauthorizedUrl) {
        this.unauthorizedUrl = unauthorizedUrl;
    }

    public String getLogoutUrl() {
        return logoutUrl;
    }

    public void setLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }

    public String getAnonUrl() {
        return anonUrl;
    }

    public void setAnonUrl(String anonUrl) {
        this.anonUrl = anonUrl;
    }


}
