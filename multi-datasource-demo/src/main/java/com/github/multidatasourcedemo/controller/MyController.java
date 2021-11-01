package com.github.multidatasourcedemo.controller;

import com.github.multidatasourcedemo.domain.City;
import com.github.multidatasourcedemo.domain.User;
import com.github.multidatasourcedemo.service.CityService;
import com.github.multidatasourcedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private UserService userService;

    @Autowired
    private CityService cityService;

    @GetMapping("/user")
    public String getUser() {
        User user = userService.getUserById(1);
        return user.toString();
    }

    @GetMapping("/city")
    public String getCity() {
        City city = cityService.getCityById(1);
        return city.toString();
    }
}
