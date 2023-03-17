package com.example.demo.controller;


import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Component
@RestController
public class DemoControllerImpl {

    @Autowired
    private DemoService service;


    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return service.doService( String.format("Hello %s!", name) );
    }

}
