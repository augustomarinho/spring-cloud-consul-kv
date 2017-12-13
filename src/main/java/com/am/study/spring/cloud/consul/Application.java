package com.am.study.spring.cloud.consul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigurationProperties
public class Application {

    @Autowired
    private Environment environment;

    @Value("${spring.application.name:testConsulApp}")
    private String appName;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @RequestMapping("/appName")
    public String rest() {
        return appName;
    }

    @RequestMapping("/property")
    public String query(@RequestParam("q") String q) {
        return environment.getProperty(q, "NotFound");
    }
}