package learn.spring.spr;

public class Motherboard {
	String brand;
	double power;
	public Motherboard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Motherboard(String brand, double power) {
		super();
		this.brand = brand;
		this.power = power;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Motherboard [brand=" + brand + ", power=" + power + "]";
	}
	
	
}
