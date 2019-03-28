package com.laoy.test;

import com.laoy.config.AppConfig;
import com.laoy.dao.IndexDao;
import com.laoy.dao.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		/*这种方法必须要有 xml 因为是读取的xml*/
		/*ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:Spring.xml");
		IndexService service = (IndexService) classPathXmlApplicationContext.getBean("indexService");
		service.service();*/

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexService indexService = (IndexService) annotationConfigApplicationContext.getBean("indexService");
		indexService.service();

	}
}
