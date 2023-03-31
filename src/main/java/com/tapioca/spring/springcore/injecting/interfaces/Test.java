package com.tapioca.spring.springcore.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tapioca/spring/springcore/injecting/interfaces/config.xml");

		OrderBO bo = (OrderBO) context.getBean("bo");
		bo.placeOrder();

	}

}