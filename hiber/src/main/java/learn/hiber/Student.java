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
	
	public Student() {
		super();
	}
		
	public Student(int kodId,String name, String address, int yop) {
		this.kodId = kodId;
		this.name = name;
		this.address = address;
		this.yop = yop;
	}
	

	
	public int getKodId() {
		return kodId;
	}

	public void setKodId(int kodId) {
		this.kodId = kodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	@Override
	public String toString() {
		return "Student [kodId=" + kodId + ", name=" + name + ", address=" + address + ", yop=" + yop + "]";
	}

}
