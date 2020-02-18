package com.example.service2;

import com.netflix.discovery.EurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2controlller {
    @RequestMapping(value = "/")
    public String service2()
    {
        return "hello from the service 2";
    }
}
