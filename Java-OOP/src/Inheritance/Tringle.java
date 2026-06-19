package Inheritance;

public class Tringle extends Shape {

	private int base;
	private int hight;
	
	public int getBase() {
		return this.base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return this.hight;
	}
	public void setHeight(int hight) {
		this.hight = hight;
	}
	public void getArea() {
		System.out.println("Area of Tringle: " + (base * hight) / 2.0);
	}
}
