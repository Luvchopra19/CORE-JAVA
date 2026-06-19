package Constructor;

public class TestPerson {
public static void main(String[] args) {
	
	Person p1 = new Person("Ram", "Indore");
	
	System.out.println("Name: " + p1.getname());
	System.out.println("Address: " + p1.getAddress());
}
}
