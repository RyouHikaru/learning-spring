package com.tapioca.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.tapioca.spring.springjdbc.employee.dao.EmployeeDAO;
import com.tapioca.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.tapioca.spring.springjdbc.employee.dto.Employee;

@Component("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * Create employee
	 */
	@Override
	public int create(Employee employee) {
		String sql = "INSERT INTO Employee VALUES(?, ?, ?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstname(), employee.getLastname());
		return result;
	}
	
	/**
	 * Update employee
	 */
	@Override
	public int update(Employee employee) {
		String sql = "UPDATE Employee SET firstname = ?, lastname = ? WHERE id = ?";
		int result = jdbcTemplate.update(sql, employee.getFirstname(), employee.getLastname(), employee.getId());
		return result;
	}

	/**
	 * Delete employee
	 */
	@Override
	public int delete(int id) {
		String sql = "DELETE FROM Employee WHERE id = ?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	/**
	 * View employee
	 */
	@Override
	public Employee read(int id) {
		String sql = "SELECT * FROM Employee WHERE id = ?";
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		Employee employee =  jdbcTemplate.queryForObject(sql, employeeRowMapper, id);
		return employee;
	}

	/**
	 * View employees
	 */
	@Override
	public List<Employee> read() {
		String sql = "SELECT * FROM Employee";
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		List<Employee> result =  jdbcTemplate.query(sql, employeeRowMapper);
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
