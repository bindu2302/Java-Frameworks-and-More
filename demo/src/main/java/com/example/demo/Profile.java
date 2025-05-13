package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	@Value("${p.name}")
	String name;
	@Value("${p.age}")
	int age;
	@Value("${p.address}")
	String address;
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profile(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Profile [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
}
