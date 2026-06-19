package Basic;

public class CountACharFromString {
public static void main(String[] args) {
	String str = "google";
	int count = 0;
	for (int i = 0; i < str.length(); i++) {
		if('o' == str.charAt(i)) {
			count++;
		}
	}
	System.out.println("o = " + count);
}
}
