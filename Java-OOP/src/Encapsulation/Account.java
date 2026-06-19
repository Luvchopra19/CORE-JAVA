package Encapsulation;

public class Account {

	private String number;
	private String type;
	private double balance;
	
	public String getNumber(){
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number; 
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getbalance() {
		return this.balance;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
	public void diposit(double diposit) {
		balance = balance + diposit;
		System.out.println("Balance diposit: " + balance);
	}
	public void Withdraw(double withdraw) {
		if(balance > withdraw) {
			balance = balance - withdraw;
			System.out.println("total balance: " + balance);
		}else {
			System.err.println("Insufficeant Fund");
		}
	}
}