package com.tapioca.spring.springcore.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype") // By default this is singleton
public class Instructor {

	// @Value will always override the assignment
	// T(class).method(param) - Spring expression Language
	@Value("#{T(java.lang.Integer).MIN_VALUE}") // Primitive
	private int id;

	@Value("#{new java.lang.String('Tapioca').toUpperCase()}")
	private String name;

	@Value("#{topics}") // Collections
	private List<String> topics;

	@Value("#{2 + 4 > 5}")
	private boolean active;

	@Autowired // Object
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", active=" + active + ", profile="
				+ profile + "]";
	}

}
