package Basic;

public class LargestNumberInArray {
	public static void main(String[] args) {
		int[] a = {5, 10, 151, 20, 25, 30, 35};
		int largestno = a[0];
		for(int i : a) {
		if(i > largestno){
			largestno = i;
		}
		}
		System.out.println("largest No is =" + largestno);
	}

}

