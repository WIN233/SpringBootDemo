package com.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//assignableTypes指定目标
@ControllerAdvice(assignableTypes = HelloWorldController.class)
public class HelloWorldControllerAdvice {

    @ModelAttribute("language")
    public String language(@RequestHeader("Accept-Language")String language) {
        return language;
    }

    @ModelAttribute("jsessionid")
    public String jsessionid(@CookieValue("JSESSIONID")String jsessionid) {
        return jsessionid;
    }


    @ModelAttribute("message")
    public String message() {
        return "Hello World";
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity onError(Throwable t) {
        return ResponseEntity.ok(t.getMessage());
    }

}
