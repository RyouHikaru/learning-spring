package com.tapioca.spring.springcore.assignment;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/tapioca/spring/springcore/assignment/config.xml");
//
//		ShoppingCart shoppingCart = (ShoppingCart) context.getBean("shoppingcart");
//		System.out.println(shoppingCart);
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/tapioca/spring/springcore/assignment/config.xml");
		
		TicketReservation ticketReservation = (TicketReservation) context.getBean("ticketreservation");
		System.out.println(ticketReservation);
	}

}
