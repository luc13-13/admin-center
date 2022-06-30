package com.lc.admin.center.config;

import com.lc.admin.center.annotation.ConditionOnRedisCache;
import com.lc.admin.center.condition.MyShiroProperties;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.session.mgt.eis.MemorySessionDAO;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.crazycake.shiro.RedisCacheManager;
import org.crazycake.shiro.RedisManager;
import org.crazycake.shiro.RedisSessionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


/**
 * @author: lucheng
 * @data: 2022/2/22 13:28
 * @version: 1.0
 */
@Configuration(proxyBeanMethods = false)
@RequiredArgsConstructor
@Slf4j
public class ShiroConfig {

    @Autowired
    private RedisProperties redisProperties;
//    @Autowired(required = false)
//    public void setRedisProperties(RedisProperties redisProperties) {
//        this.redisProperties = redisProperties;
//    }

//    @Value("${myshiro.shiro.session-timeout}")
//    private String sessionTimeout;

    @Autowired
    private final MyShiroProperties myShiroProperties;


    private RedisManager redisManager() {
        RedisManager redisManager = new RedisManager();
        redisManager.setHost(redisProperties.getHost() + ":" + redisProperties.getPort());
        if(StringUtils.isNoneBlank(redisProperties.getPassword())) {
            redisManager.setPassword(redisProperties.getPassword());
        }
        return redisManager;
    }



    //
    @Bean
    @ConditionOnRedisCache
    public RedisCacheManager redisCacheManager() {
        RedisCacheManager redisCacheManager = new RedisCacheManager();
        redisCacheManager.setRedisManager(redisManager());
        System.out.println(myShiroProperties.getShiroProperties().getSessionTimeout());
        redisCacheManager.setExpire((int) myShiroProperties.getShiroProperties().getSessionTimeout().getSeconds());
        log.info("已启用redis缓存");
        return redisCacheManager;
    }

    @Bean
    @ConditionalOnMissingBean(RedisCacheManager.class)
    public EhCacheManager ehCacheManager() {
        // shiro 默认的缓存组件，如果配置文件中没有开启redis作为缓存，则使用默认的
        // enCacheManager可以通过配置文件设置，也可以手动设置
        EhCacheManager ehCacheManager = new EhCacheManager();
        ehCacheManager.setCacheManagerConfigFile("classpath:shiro-ehcache.xml");
        log.info("已启用默认缓存ehcache");
        return ehCacheManager;
    }


    @Bean
    public DefaultWebSecurityManager securityManager(Realm realm,
                                                     @Nullable RedisCacheManager redisCacheManager,
                                                     @Nullable EhCacheManager ehCacheManager,
                                                     DefaultWebSessionManager sessionManager){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(realm);
        securityManager.setSessionManager(sessionManager);
        securityManager.setCacheManager(redisCacheManager == null ? ehCacheManager : redisCacheManager);

        return securityManager;
    }

    @Bean
    public DefaultWebSessionManager sessionManager(@Nullable RedisSessionDAO redisSessionDAO,
                                                   @Nullable MemorySessionDAO memorySessionDAO){
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        sessionManager.setGlobalSessionTimeout(84600);
        sessionManager.setSessionDAO(redisSessionDAO == null ? memorySessionDAO : redisSessionDAO);
        sessionManager.setSessionIdUrlRewritingEnabled(false);
        return sessionManager;
    }

}
