package Constructor;

public class Shape {

	public String color;
	public int boderWidth;
	
	public Shape() {
		System.out.println("this is default constructor shape");
	}
	public Shape(String color) {
		this();
		this.color = color;
		System.out.println(this.color);
	}
	public Shape(int boderWidth, String color) {
		this(color);
		this.boderWidth = boderWidth;
		System.out.println(this.boderWidth);
	}
}
