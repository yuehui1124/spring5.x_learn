package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				=new AnnotationConfigApplicationContext(Appconfig.class);
		System.out.printf(annotationConfigApplicationContext.getBean(TestService.class).getClass().getName());
	}
}
