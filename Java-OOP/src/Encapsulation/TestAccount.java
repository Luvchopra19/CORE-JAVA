package Encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a1 = new Account();
		
		a1.setNumber("10965007680793");
		a1.setType("current");
		a1.setbalance(1000.00);
		
		System.out.println("Account Number: " + a1.getNumber());
		System.out.println("Account Type: " + a1.getType());
		System.out.println("Account balance: " + a1.getbalance());
		a1.diposit(500);
		a1.Withdraw(200);
		a1.Withdraw(2000);
	}

}
