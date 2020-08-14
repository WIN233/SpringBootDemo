package com.demo.listener;

import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.Ordered;

public class BeforConfigFileApplicationListener implements Ordered, SmartApplicationListener {


    @Override
    public int getOrder() {
        //比ConfigFileApplicationListener优先级更高
        return ConfigFileApplicationListener.DEFAULT_ORDER+1;
    }


    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(eventType)
                || ApplicationPreparedEvent.class.isAssignableFrom(eventType);
    }

    @Override
    public boolean supportsSourceType(Class<?> aClass) {
        return true;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationEnvironmentPreparedEvent) {
            ApplicationEnvironmentPreparedEvent preparedEvent = (ApplicationEnvironmentPreparedEvent) event;
            String name = preparedEvent.getEnvironment().getProperty("name");
            System.out.println("getEnvironment:"+name);
        }
        if (event instanceof ApplicationPreparedEvent) {
        }
    }
}
