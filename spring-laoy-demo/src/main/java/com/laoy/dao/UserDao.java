package com.laoy.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.sql.SQLOutput;

@Repository
public class UserDao {

	public UserDao() {
		System.out.println("构造方法");
	}
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	public void query() {
		System.out.println("test");
	}
}
