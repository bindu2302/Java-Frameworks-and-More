package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JavaMentor implements Mentor {
	
	public void teach() {
		System.out.println("Teaching Java.. .");
	}
}
 