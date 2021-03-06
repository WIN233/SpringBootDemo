package com.demo.controller;

import com.demo.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * User {@link RestController}
 *
 */
@RestController
public class UserRestController {

    @PostMapping(value = "/echo/user")
    public User user(@RequestBody User user) {
        return user;
    }

}
