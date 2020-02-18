package com.example.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Serviceonecontroller {
    @RequestMapping(value = "/")
    public String getfromserviceone()
    {
        return "hello world service 1";
    }
}
