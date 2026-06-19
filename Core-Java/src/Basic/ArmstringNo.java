package Basic;

public class ArmstringNo {
	public static void main(String[] args) {
		int temp = 153;
		int n = temp;
		int r = 0;
		int ArmstringNo = 0;
		while(n > 0) {
			r = n % 10;
			ArmstringNo = ArmstringNo + r * r * r;
			n = n / 10;
		}
		System.out.println(ArmstringNo);
		if(temp == ArmstringNo) {
		System.out.println("ArmstringNo");	
		}else {
			System.out.println("not ArmstringNo");
		}
	}
}
