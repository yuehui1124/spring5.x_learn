package com.laoy;

import com.laoy.Servcie.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * @author yueyueyue
 * @date 2019/3/28 14:25
 * Description: spring
 */
@Component
public class SetMethodDemo {
	private OrderService orderService;

	@Autowired
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}


	public void test(){
		orderService.order();
	}
}
