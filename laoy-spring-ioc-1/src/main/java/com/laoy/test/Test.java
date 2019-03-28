package com.laoy.test;

import com.laoy.Service.IndexService;
import com.laoy.config.AppConfig;
import com.laoy.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(annotationConfigApplicationContext.getBean(IndexService.class).getClass().getSimpleName());


	}
}
