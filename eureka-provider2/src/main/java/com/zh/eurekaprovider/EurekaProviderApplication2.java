package com.zh.eurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Admin
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication2.class, args);
    }

}
