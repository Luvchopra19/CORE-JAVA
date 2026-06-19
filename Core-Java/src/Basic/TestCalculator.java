
package Basic;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first No .....");
		int a = sc.nextInt();
		
		System.out.println("Entrer second no ......");
		float b = sc.nextInt();
						
		System.out.println("Enterany one +, -, /, % ");
		String opr = sc.next();
		
		switch(opr) {
		
		case"+":
			System.out.println("RESULT = " + (a + b));
			break;
		case"-":
			System.out.println("RESULT = " + (a - b));
			break;
		case"*":
			System.out.println("RESULT = " + (a * b));
			break;
		case"/":
			System.out.println("RESULT = " + (a / b));
			
			break;
		case"%":
			System.out.println("RESULT = " + (a % b));
			break;
		}
			
	}
}
