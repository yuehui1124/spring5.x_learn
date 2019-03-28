package com.laoy;

import com.laoy.Servcie.OrderService;
import com.laoy.Servcie.QueryCityService;
import com.laoy.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yueyueyue
 * @date 2019/3/28 12:40
 * Description: spring
 */
public class DemoApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(ApplicationConfig.class);

		TestDemo testDemo = (TestDemo) annotationConfigApplicationContext.getBean("testDemo");
		System.out.println(testDemo);
		testDemo.test();

		SetMethodDemo setMethodDemo = (SetMethodDemo) annotationConfigApplicationContext.getBean("setMethodDemo");

		setMethodDemo.test();




	}
}
