package com.tapioca.spring.springorm.product.test;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tapioca.spring.springorm.product.dao.ProductDAO;
import com.tapioca.spring.springorm.product.entity.Product;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tapioca/spring/springorm/product/test/config.xml");
		
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		
//		Product product = new Product();
//		product.setId(1);
//		product.setName("iPhone 14 Pro");
//		product.setDesc("New iPhone has been released.");
//		product.setPrice(1500);
		
//		productDAO.create(product);
//		productDAO.update(product);
//		productDAO.delete(product);
//		Product product = productDAO.find(1);
//		System.out.println(product);
		
		List<Product> products = productDAO.findAll();
		System.out.println(products);
	}
}
