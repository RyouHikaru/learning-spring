package com.tapioca.spring.springcore.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired(required = false) // Property level
	@Qualifier("address2") // matches bean name
	private Address address;
	
//	@Autowired - Constructor level
//	public Employee(Address address) {
//		this.address = address;
//	}

	public Address getAddress() {
		return address;
	}


//	@Autowired - Setter level
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
