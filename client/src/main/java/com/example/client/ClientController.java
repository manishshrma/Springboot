package com.example.client;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import javassist.expr.Instanceof;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {
    @Autowired
    private RestTemplateBuilder builder;
    @Autowired
    private EurekaClient eurekaClient;


    @RequestMapping(value = "/")
    public String callServiceClass()
    {
        RestTemplate restTemplate=builder.build();
        InstanceInfo inst=eurekaClient.getNextServerFromEureka("eurekaserviceone",false);
        InstanceInfo inst2=eurekaClient.getNextServerFromEureka("eurekaservicetwo",false);

        String url=inst.getHomePageUrl();
        ResponseEntity<String> rsp= restTemplate.exchange(url, HttpMethod.GET,null,String.class);

        String url1=inst2.getHomePageUrl();
        ResponseEntity<String> rsp2= restTemplate.exchange(url1, HttpMethod.GET,null,String.class);
        return rsp.getBody() + " "+rsp2.getBody();
    }
}
