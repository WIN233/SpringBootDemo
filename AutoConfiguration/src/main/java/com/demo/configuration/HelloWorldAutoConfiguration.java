package com.demo.configuration;

import com.demo.annotation.ConditionalOnSystemProperty;
import com.demo.annotation.EnableHelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Spring模式注解
@EnableHelloWorld //Spring @Enable 模块装配
@ConditionalOnSystemProperty(value = "admin",name = "user.name") // 条件装配
public class HelloWorldAutoConfiguration {

    @Bean
    public String hello() {
        return "I am a bean";
    }

}
