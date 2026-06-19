package Basic;

public class TestArry {
	public static void main(String[] args) {
		int[] a = {5, 10, 15, 20, 25, 30, 35 };
		System.out.println(a[0] + "," + a[1] + "," + a[2] + "," + a[3] + "," + a[4]);
		System.out.println(a[0] + a[1] + a[2] + a[3] + a[4]);
		
		

	System.out.println("--------------------");

for(int b : a) {
	System.out.println(b + ",");
}
System.out.println();
System.out.println("----------------");

for(int i = 0; i < a.length; i++) {
	System.out.println(i + " = " + a[i]);
}
}
}


