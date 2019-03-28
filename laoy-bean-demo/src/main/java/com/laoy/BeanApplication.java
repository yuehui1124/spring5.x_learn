package com.laoy;

import com.laoy.config.BeanApplicationConfig;
import com.laoy.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yueyueyue
 * @date 2019/3/28 16:52
 * Description: spring
 */

public class BeanApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(BeanApplicationConfig.class);
		annotationConfigApplicationContext.register(OrderService.class);
		//annotationConfigApplicationContext.refresh();
		System.out.println(annotationConfigApplicationContext.getBean(OrderService.class).getClass().getSimpleName());
		OrderService orderService = (OrderService) annotationConfigApplicationContext.getBean("orderService");
		orderService.query();
	}
}
