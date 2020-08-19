package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
public class WebMvcConfig {

    /**
     * <!--    <bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">-->
     * <!--        <property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>-->
     * <!--        <property name="prefix" value="/WEB-INF/jsp/"/>-->
     * <!--        <property name="suffix" value=".jsp"/>-->
     * <!--    </bean>-->
     * @return
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
        internalResourceViewResolver.setSuffix("jsp");
        internalResourceViewResolver.setViewClass(JstlView.class);
        return internalResourceViewResolver;
    }




}
