package Basic;

public class PrimeNo {
	public static void main(String[] args) {
		int n = 7;
		int count = 0;
		for(int i = 1; i < n; i++) {
		if(n % i == 0) {
			count++;
		}
		}
		System.out.println(n);
		if(count > 0) {
			System.out.println("primeNO");
		}else {
			System.out.println("not PrimeNO");
		}
	}

}
