package Polimorphism;

public class Shape {
	
	protected String color;
	protected int boderWidth;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBoderwidth() {
		return boderWidth;
	}
	public void setBoderWidth(int boderWidth) {
		this.boderWidth = boderWidth;
	}
	public void area() {
		System.out.println("area not private by child class");
	}
	public static Shape getShape(int i) {
	
	if(i == 0) {
		return new Circle();
	}
	if(i == 1) {
		return new Rectangle();
	}
	if (i == 2) {
		return new Tringle();
	}
	return new Shape();
	}
}
