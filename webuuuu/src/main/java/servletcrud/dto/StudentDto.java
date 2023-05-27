package servletcrud.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class StudentDto {
	@Id
	private int std_id;
	private String std_name;
	private long number;
	private String gender;
	
	
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	@Override
	public String toString() {
		return "StudentDto [std_id=" + std_id + ", std_name=" + std_name + ", number=" + number + ", gender=" + gender
				+ "]";
	}
	

}
