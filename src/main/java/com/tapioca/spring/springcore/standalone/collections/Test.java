package com.tapioca.spring.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tapioca/spring/springcore/standalone/collections/config.xml");

		ProductList productList = (ProductList) context.getBean("productList");
		System.out.println(productList);
	}

}
