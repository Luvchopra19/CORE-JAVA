package Polimorphism;

public class Tringle extends Shape{
	
	private int hight;
	private int base;
	
	public int getHight() {
		return hight;
	}
	public void setHight (int hight) {
		this.hight = hight;
	}
	public int getBase() {
		return base;
	}
	public void setBase (int base) {
		this.base = base;
	}
	public void area () {
		System.out.println("Area of Tringle: " + ((base * hight)/2.0));
	}
}
