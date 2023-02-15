package model.entities;

public class Account {
	private Double id;
	private Double accountNumber;
	private Users holder;
	private Double amount;
	
	public void deposit(){}
	public void withdraw(){}
	public boolean transfer(Account account, Double value) {
		return true;
	}
	public double getBalance() {
		return amount;
	}
	
	
}
