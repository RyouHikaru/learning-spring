package com.tapioca.spring.springcore.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImpl implements OrderBO {

	@Autowired
	@Qualifier("dao2")
	private OrderDAO dao;

	@Override
	public void placeOrder() {
		System.out.println("Inside placeOrder method of OrderBOImpl");
		dao.createOrder();
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
