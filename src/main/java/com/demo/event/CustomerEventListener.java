package com.demo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerEventListener implements ApplicationListener<CustomerEvent> {

    @Override
    public void onApplicationEvent(CustomerEvent customerEvent) {
        System.out.println("收到事件："+customerEvent);
    }
}
