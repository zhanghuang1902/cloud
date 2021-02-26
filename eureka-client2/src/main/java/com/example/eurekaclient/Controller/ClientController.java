package com.example.eurekaclient.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:ClientController
 * Package:com.example.eurekaclient.Controller
 * Description:
 *
 * @date:2021/2/25 17:56
 * @author:zh
 */
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/help")
    public String help(){
//        ServiceInstance provider = discoveryClient.getInstances("eureka-provider").get(0);
//        String host = provider.getHost();
//        int port = provider.getPort();
//        System.out.println(host);
//        System.out.println(port);
        String s = restTemplate.getForObject("http://eureka-provider/provider/ask", String.class);
        System.out.println(s);
        return s;
    }
}
