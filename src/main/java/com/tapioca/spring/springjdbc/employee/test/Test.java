package com.tapioca.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tapioca.spring.springjdbc.employee.dao.EmployeeDAO;
import com.tapioca.spring.springjdbc.employee.dto.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tapioca/spring/springjdbc/employee/test/config.xml");

		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");

//		Employee employee = new Employee();
//		employee.setId(3);
//		employee.setFirstname("Quinn");
//		employee.setLastname("Barley");

//		int result = employeeDAO.create(employee);
//		int result = employeeDAO.update(employee);
//		int result = employeeDAO.delete(1);
//		Employee employee = employeeDAO.read(2);
		List<Employee> result = employeeDAO.read();
		
//		System.out.println("Number of records inserted: " + result);
//		System.out.println("Number of records updated: " + result);
//		System.out.println("Number of records deleted: " + result);
//		System.out.println("Employee details: " + employee);
		System.out.println("Employees: " + result);
	}
}
