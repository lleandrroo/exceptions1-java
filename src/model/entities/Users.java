package model.entities;

public class Users {
	private Double id;
	private String name;
	
	public Users() {
	}
	
	public Users(Double registerNumber, String name) {
		this.id = registerNumber;
		this.name = name;
	}

	public Double getRegisterNumber() {
		return id;
	}

	public void setRegisterNumber(Double registerNumber) {
		this.id = registerNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	
	
	
	
	
}
