package learn.hib4;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Tech {
	@Id
	int techId;
	String techName;
	@ManyToMany
	List<Trainer> trainerList;
	public Tech() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tech(int techId, String techName, List<Trainer> trainerList) {
		super();
		this.techId = techId;
		this.techName = techName;
		this.trainerList = trainerList;
	}
	public int getTechId() {
		return techId;
	}
	public void setTechId(int techId) {
		this.techId = techId;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	public List<Trainer> getTrainerList() {
		return trainerList;
	}
	public void setTrainerList(List<Trainer> trainerList) {
		this.trainerList = trainerList;
	}
	@Override
	public String toString() {
		return "Tech [techId=" + techId + ", techName=" + techName + ", trainerList=" + trainerList + "]";
	}
	
	
}