package com.ashish.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DependencyInjectionApplication {

    @Autowired

    public static void main(String[] args) {
        SpringApplication.run(DependencyInjectionApplication.class, args);
    }

    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

}
