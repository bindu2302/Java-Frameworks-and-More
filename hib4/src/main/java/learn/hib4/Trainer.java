package learn.hib4;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Trainer {
	@Id
	int trainerId;
	String trainerName;
	@ManyToMany
	List<Tech> techList;
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(int trainerId, String trainerName, List<Tech> techList) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.techList = techList;
	}
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public List<Tech> getTechList() {
		return techList;
	}
	public void setTechList(List<Tech> techList) {
		this.techList = techList;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", techList=" + techList + "]";
	}
	
	
}