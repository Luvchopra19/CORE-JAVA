package Overriding;

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
	}
