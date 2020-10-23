package com.wy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author by wangyi
 * @classname SpringMock
 * @description TODO
 * @date 2020/10/21 20:52
 */
public class SpringMock {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//
//		Car car = (Car) applicationContext.getBean("car");
//		System.out.println(car);
	}
}

