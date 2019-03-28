package com.laoy.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: yuedede
 * @date: 2018-12-16 10:24
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println(beanName);
		if (beanName.equals("userDao")){
			System.out.println("initBeforeProcessor");
		}

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println(beanName);
		if (beanName.equals("userDao")){
			System.out.println("initAfterProcessor");
		}

		return bean;
	}
}
