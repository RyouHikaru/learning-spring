package com.tapioca.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setId method");
		this.id = id;
	}

	@PostConstruct
	public void init() {
		System.out.println("Inside init method");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
