package com.lc.admin.center;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.SortedSet;

/**
 * @author: lucheng
 * @data: 2021/11/28 2:57
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan("com.lc.admin.center.mapper")
public class Bootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Bootstrap.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
