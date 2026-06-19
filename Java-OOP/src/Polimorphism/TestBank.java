package Polimorphism;

public class TestBank {
public static void main(String[] args) {
	
	Bank[] banks = new Bank[3];
	
	banks[0] = new AxisBank();
	banks[1] = new HDFCBank();
	banks[2] = new ICICIBank();
	loanEnquiry(banks);
	}
	static void loanEnquiry(Bank[] banks) {
		for(Bank b : banks) {
			String Name = b.getName();
			double rate = b.getIntrestRate();
			
			System.out.println(Name + " = " + rate);
}
	}
}
