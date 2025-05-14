package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AutoWiring2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = new 
				AnnotationConfigApplicationContext(AppConfig.class);
		Course c = ctx.getBean(Course.class);
		System.out.println(c);
		c.m.teach();
	}

}
