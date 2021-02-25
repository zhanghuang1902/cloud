package com.example.eurekaclient.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/help")
    public String help(){
        String s = restTemplate.getForObject("http://erueka-provider:8763/provider/ask", String.class);
        System.out.println(s);
        return s;
    }
}
