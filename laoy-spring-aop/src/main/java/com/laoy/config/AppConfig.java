package com.laoy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.laoy")
//@EnableAspectJAutoProxy(proxyTargetClass = true)  使用的是cglib
//@EnableAspectJAutoProxy(proxyTargetClass = false) 使用的是 jdk动态代理
//@EnableAspectJAutoProxy  默认jdk动态代理  底层使用的是接口  所以 加了接口的  都是jdk动态代理
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
}

