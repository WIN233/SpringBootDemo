package com.demo;

import com.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;


@RestController
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class Example {
    @Autowired
    private DemoService demoService;


    @RequestMapping("/")
    String home() {
        demoService.sayHello();
        return "Hello World!";
    }

    @RequestMapping("/close")
    public String close() {
        demoService.close();
        return "hhhhhh";
    }

    @RequestMapping("/pub")
    public String pub(String msg) {
        demoService.publishEvent(msg);
        return "发布成功";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}