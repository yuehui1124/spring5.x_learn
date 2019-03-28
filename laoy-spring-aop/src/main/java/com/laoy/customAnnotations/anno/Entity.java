package com.laoy.customAnnotations.anno;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//指定位置  出现一个类上面
@Target({ElementType.TYPE})
//指定注解保留在什么地方  这个是RetentionPolicy.CLASS  是在类
@Retention(RetentionPolicy.CLASS)
//只会存在class文件中  runtime在运行的时候存在
//@Retention(RetentionPolicy.SOURCE)

public @interface Entity {

	public String value() default "";


}
