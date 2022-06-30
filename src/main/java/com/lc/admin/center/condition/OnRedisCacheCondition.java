package com.lc.admin.center.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author: lucheng
 * @data: 2022/2/22 20:47
 * @version: 1.0
 */

public class OnRedisCacheCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return Boolean.parseBoolean(context.getEnvironment().getProperty(MyShiroProperties.ENABLE_REDIS_CACHE));
    }
}
