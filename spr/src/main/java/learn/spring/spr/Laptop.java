package learn.spring.spr;

public class Laptop {
	Motherboard mb;

	public Laptop(Motherboard mb) {
		super();
		this.mb = mb;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Laptop [mb=" + mb + "]";
	}

	public Motherboard getMb() {
		return mb;
	}

	public void setMb(Motherboard mb) {
		this.mb = mb;
	}
	

}