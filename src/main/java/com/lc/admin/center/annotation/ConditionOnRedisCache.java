package com.lc.admin.center.annotation;

import com.lc.admin.center.condition.OnRedisCacheCondition;
import org.springframework.context.annotation.Conditional;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: lucheng
 * @data: 2022/2/22 20:45
 * @version: 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional(OnRedisCacheCondition.class)
public @interface ConditionOnRedisCache {
}
