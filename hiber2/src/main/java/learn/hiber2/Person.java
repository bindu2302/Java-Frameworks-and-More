package learn.hiber2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	int id;
	String nickName;
	@OneToOne
	AadharCard card;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String nickName, AadharCard card) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.card = card;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public AadharCard getCard() {
		return card;
	}
	public void setCard(AadharCard card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", nickName=" + nickName + ", card=" + card + "]";
	}
	
}