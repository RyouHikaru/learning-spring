package com.tapioca.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tapioca/spring/springjdbc/config.xml");

		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "INSERT INTO Employee VALUES(?, ?, ?)";
		int result = jdbcTemplate.update(sql, new Integer(1), "Tapi", "Orca");
		System.out.println("Number of rows inserted: " + result);
	}
}
