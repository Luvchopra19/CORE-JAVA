package Basic;

public class CountIntFromString {
public static void main(String[] args) {
	String str = "R1a2m3";
	int count = 0;
	for(int i = 0; i < str.length(); i++) {
		if(Character.isDigit(str.charAt(i))) {
			System.out.println(i);
			count++;
		}
	}
	System.out.println("total int in string = " + count);
}
}
