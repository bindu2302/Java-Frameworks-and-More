package learn.hiber;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	int kodId;
	String name;
	String address;
	int yop;
		
	public Student(int kodId,String name, String address, int yop) {
		this.kodId = kodId;
		this.name = name;
		this.address = address;
		this.yop = yop;
	}

}
