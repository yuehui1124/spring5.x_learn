package com.laoy.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.security.auth.Destroyable;

@Repository
public class IndexDaoIml implements IndexDao {  //, InitializingBean, DisposableBean

	public IndexDaoIml(){
		System.out.println("constructor");
	}

	@Override
	public void test() {

	}
	@PostConstruct
	public void init(){
		System.out.println("init");
	}

	/*@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet init");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destory");
	}*/
}
