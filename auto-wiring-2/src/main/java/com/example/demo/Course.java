package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Course {
	@Autowired
	Mentor m;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(Mentor m) {
		super();
		this.m = m;
	}

	public Mentor getM() {
		return m;
	}

	public void setM(Mentor m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "Course [m=" + m + "]";
	}
	
}
