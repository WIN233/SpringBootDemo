package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
public class EnableAutoConfigurationDemo {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(EnableAutoConfigurationDemo.class, args);


        Object hello = context.getBean("hello");
        System.out.println(hello);


    }

}
