package com.demo.event;

import org.springframework.context.ApplicationEvent;

public class CustomerEvent extends ApplicationEvent {
    public CustomerEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "CustomerEvent{" +
                "source=" + source +
                '}';
    }
}
