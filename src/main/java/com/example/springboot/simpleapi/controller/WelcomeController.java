package com.example.springboot.simpleapi.controller;

import com.example.springboot.simpleapi.configuration.BasicConfiguration;
import com.example.springboot.simpleapi.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WelcomeController {

    @Autowired
    private WelcomeService service;

    @Autowired
    private BasicConfiguration configuration;
    //welcome
    @RequestMapping("/welcome")
    public String welcome() {
        return service.retrieveWelcomeMessage();
    }

    @RequestMapping("/dynamic-configuration")
    public Map dynamicConfiguration() {
        Map map = new HashMap();
        map.put("message", configuration.getMessage());
        map.put("number", configuration.getNumber());
        map.put("value", configuration.isValue());

        return map;
    }
}
