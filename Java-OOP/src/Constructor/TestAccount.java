package Constructor;

public class TestAccount {
public static void main(String[] args) {
	
	Account a1 = new Account("100092837465", "Current", 1000.00);
	
	System.out.println("Number: " + a1.getNumber());
	System.out.println("Type: " + a1.getType());
	System.out.println("Balance: " + a1.getBalance());
}
}
