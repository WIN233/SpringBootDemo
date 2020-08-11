package com.demo.service;

import com.demo.context.SpringContextUtil;
import com.demo.event.CustomerEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public void sayHello() {
        System.out.println("say hello");
    }

    public void close() {
        ConfigurableApplicationContext applicationContext = (ConfigurableApplicationContext)SpringContextUtil.getApplicationContext();
        applicationContext.refresh();
    }

    public void publishEvent(String msg) {
        SpringContextUtil.getApplicationContext().publishEvent(new CustomerEvent(msg));
    }


}
