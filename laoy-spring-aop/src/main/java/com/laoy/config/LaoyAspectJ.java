package com.laoy.config;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LaoyAspectJ {

	//demo 在  https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#aop-pointcuts-examples
	//一个切点 里面包括一个一个连接点
/*
	execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern) throws-pattern?)
	这里问号表示当前项可以有也可以没有，其中各项的语义如下

	modifiers-pattern：方法的可见性，如public，protected；

	ret-type-pattern：方法的返回值类型，如int，void等；

	declaring-type-pattern：方法所在类的全路径名，如com.spring.Aspect；

	name-pattern：方法名类型，如buisinessService()；

	param-pattern：方法的参数类型，如java.lang.String；

			throws-pattern：方法抛出的异常类型，如java.lang.Exception；
	example:
	execution(public * com.spring.service.BusinessObject.businessService(java.lang.String,..))*/

//由于Spring切面粒度最小是达到方法级别，
// 而execution表达式可以用于明确指定方法返回类型，
// 类名，方法名和参数名等与方法相关的信息，并且在Spring中，
// 大部分需要使用AOP的业务场景也只需要达到方法级别即可，
// 因而execution表达式的使用是最为广泛的
	@Pointcut("execution(* com.laoy.dao.*.*(..))")
	public void pointCutExecution(){

	}
	//within表达式的最小粒度为类
	@Pointcut("within(com.laoy.dao.*)")
	public void pointCutWith(){

	}
	// args表达式的作用是匹配指定参数类型和指定参数数量的方法,与包名和类名无关
	@Pointcut("args(java.lang.String)")
	public void pointCutArgs(){

	}
		//this 标识代理对象
	@Pointcut("this(com.laoy.dao.IndexDao)")
	public void pointCutThis(){

	}
	/**
	 * 通知位置
	 */
	@Before("pointCutExecution()")
	public void before() {
		System.out.println("aspect before");
	}


	@After("pointCutWith()")
	public void after() {
		System.out.println("aspect after");
	}

	@Before("pointCutThis")
	public void beforeThis(JoinPoint joinPoint){

	}
}
