package com.lc.admin.center.config;

import com.lc.admin.center.condition.MyShiroProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.net.InetAddress;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: lucheng
 * @data: 2022/2/22 19:50
 * @version: 1.0
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class ShiroRunner implements ApplicationRunner {

    private final ConfigurableApplicationContext context;
    private final MyShiroProperties myShiroProperties;
    @Value("${server.port}")
    private String port;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        if(context.isActive()) {
            String url = String.format("https://%s:%s", InetAddress.getLocalHost().getHostAddress(),port);
            log.info("Auth-center已启动，地址{}, redis缓存启用：{}",url,myShiroProperties.getShiroProperties().getEnableRedisCache());
            log.info(context.getEnvironment().getProperty(MyShiroProperties.ENABLE_REDIS_CACHE));
        }
    }
}
