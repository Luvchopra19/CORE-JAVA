package Stringobject;

public class StringBuff {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Vijay ");
		sb.append("Dinanath Chauhan");
		System.out.println("length :)" + sb.length());
		System.out.println("capacity :)" + sb.capacity());
		System.out.println("character :)" + sb.charAt(7));
		System.out.println("index :)" + sb.indexOf("C"));
		System.out.println(sb);
		System.out.println("Reverse :)" + sb.reverse());
		System.out.println("Replace :)" + sb.replace(0, 5, "jay"));
		System.out.println("Reverse :)" + sb.reverse());
	}
}