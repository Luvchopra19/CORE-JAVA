package abstraction;

public abstract class Shape {//Shape is abstract class
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
	public abstract double area();//abstract Method
}