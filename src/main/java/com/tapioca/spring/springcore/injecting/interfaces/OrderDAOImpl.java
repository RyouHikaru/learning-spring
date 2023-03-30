package com.tapioca.spring.springcore.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside createOrder method of OrderDAOImpl");
	}

}
