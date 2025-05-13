package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext  ctx = new 
				AnnotationConfigApplicationContext(AppConfig.class);
    	User u = ctx.getBean(User.class);
    	System.out.println(u);	
    }

}
