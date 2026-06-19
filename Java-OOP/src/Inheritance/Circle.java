package Inheritance;

public class Circle extends Shape {

private int radius;

public int getRadius() {
	return this.radius;
}
public void setRadius (int radius) {
	this.radius = radius;
}
public void getArea() {
	System.out.println("area of circle: " + (Math.PI * radius * radius));
}
}
