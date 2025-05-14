package com.example.demo;

import org.springframework.stereotype.Component;

@Component

public class SqlMentor implements Mentor {

	public void teach() {
		System.out.println("Teaching sql.. .");
	}
}
