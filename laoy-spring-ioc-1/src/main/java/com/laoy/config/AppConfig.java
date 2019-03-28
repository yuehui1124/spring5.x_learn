package com.laoy.config;

import jdk.nashorn.internal.objects.annotations.Constructor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Driver;

@Configuration
//过滤请参考源码demo  https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#beans-scanning-filters
//@ComponentScan(value = "com.laoy",excludeFilters = {@ComponentScan.Filter(type = FilterType.REGEX,pattern = "com.laoy.Service.*")})
@ComponentScan("com.laoy")
public class AppConfig {
	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
		return new SqlSessionFactoryBean();
	}
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/test");
		return driverManagerDataSource;
	}
/*
* @ComponentScan(basePackages = "org.example",
        includeFilters = @Filter(type = FilterType.REGEX, pattern = ".*Stub.*Repository"),
        excludeFilters = @Filter(Repository.class))
* */

/*
*  启动spring加快
* <dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context-indexer</artifactId>
        <version>5.1.3.RELEASE</version>
        <optional>true</optional>
    </dependency>
</dependencies>
*
* */

}
