package com.laoy;

import com.laoy.config.AppConfig;
import com.laoy.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		//把spring所有前提环境准备好
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(AppConfig.class);
		//annotationConfigApplicationContext.register(UserDao.class);

		//初始化spring 环境
		//annotationConfigApplicationContext.refresh();
		//UserDao userDao = (UserDao) annotationConfigApplicationContext.getBean(UserDao.class);
		UserDao userDao = (UserDao) annotationConfigApplicationContext.getBean("userDao");
		//userDao.query();
	}
}
