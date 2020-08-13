package com.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class DemoApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(ApplicationConfiguration.class)
                .bannerMode(Banner.Mode.CONSOLE)
                .web(WebApplicationType.NONE)
                .profiles("prod")
                .headless(true)
                .run(args);

    }
    @SpringBootApplication
    public static class ApplicationConfiguration {

    }







}
