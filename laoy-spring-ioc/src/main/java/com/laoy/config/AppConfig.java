package com.laoy.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.laoy")
@ImportResource("classpath:Spring.xml")
public class AppConfig {

}
