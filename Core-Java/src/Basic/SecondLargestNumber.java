package Basic;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] a = {5, 10, 151, 20, 25, 30, 30};
		int LargestNo = 0;
		for (int i : a) {
			if(i > LargestNo) {
				LargestNo = i;
			}
	}
		System.out.println("LagestNo is = " + LargestNo );
		int Secondlargest = 0;
		for (int i : a) {
			if (i > Secondlargest  && i < LargestNo) {
				Secondlargest = i;
			}
		}
System.out.println("Secondlargestno is = " + Secondlargest);
}
}