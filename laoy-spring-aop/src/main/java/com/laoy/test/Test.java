package com.laoy.test;

import com.laoy.config.AppConfig;

import com.laoy.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		//Dao dao = annotationConfigApplicationContext.getBean(IndexDao.class);
		IndexDao dao = annotationConfigApplicationContext.getBean(IndexDao.class);
		System.out.println(dao instanceof IndexDao);
		//System.out.println(dao instanceof Proxy);
		dao.query();

	}
}
