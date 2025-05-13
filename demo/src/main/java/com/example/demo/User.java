package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Autowired
	Profile p;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Profile p) {
		super();
		this.p = p;
	}

	public Profile getP() {
		return p;
	}

	public void setP(Profile p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "User [p=" + p + "]";
	}
	
}
