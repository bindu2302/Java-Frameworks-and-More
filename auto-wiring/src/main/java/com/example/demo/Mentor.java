package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mentor {
	@Value("${menName}")
	String name;
	@Value("${menExperience}")
	int experience;
	public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mentor(String name, int experience) {
		super();
		this.name = name;
		this.experience = experience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Mentor [name=" + name + ", experience=" + experience + "]";
	}
	
}
