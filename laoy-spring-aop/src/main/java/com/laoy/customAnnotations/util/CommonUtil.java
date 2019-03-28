package com.laoy.customAnnotations.util;

import com.laoy.customAnnotations.anno.Entity;

public class CommonUtil {

	/**
	 * 通过一个对象构造一个sql语句
	 * @param object
	 */
	public static String  buildQuerySqlForEntity(Object object) {

		Class clazz = object.getClass();
		//判断是否加了注解
		System.out.println(clazz.isAnnotationPresent(Entity.class));

		if (clazz.isAnnotationPresent(Entity.class)){
			//得到注解
			Entity entity = (Entity) clazz.getAnnotation(Entity.class);
			//调用方法
			String entityName = entity.value();
			System.out.println(entityName);

		}
		//select * from city where id = '1' and name = 'test'
		String sql = "select * from ";
		return "";
	}
}
