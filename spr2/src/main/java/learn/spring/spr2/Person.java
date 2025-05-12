package learn.spring.spr2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	String name;
	Set<String>contacts;
	List<String>bikes;
	Map<Integer,String>siblings;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, Set<String> contacts, List<String> bikes, Map<Integer, String> siblings) {
		super();
		this.name = name;
		this.contacts = contacts;
		this.bikes = bikes;
		this.siblings = siblings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getContacts() {
		return contacts;
	}
	public void setContacts(Set<String> contacts) {
		this.contacts = contacts;
	}
	public List<String> getBikes() {
		return bikes;
	}
	public void setBikes(List<String> bikes) {
		this.bikes = bikes;
	}
	public Map<Integer, String> getSiblings() {
		return siblings;
	}
	public void setSiblings(Map<Integer, String> siblings) {
		this.siblings = siblings;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", contacts=" + contacts + ", bikes=" + bikes + ", siblings=" + siblings + "]";
	}
	
}
