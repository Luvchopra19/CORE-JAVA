package Inheritance;

public class Rectangle extends Shape {

private int length;
private int width;

public int getLength() {
	return this.length;
}
public void setLength(int length) {
	this.length = length;
}
public int getWidth(){
	return this.width;
}
public void setWidth(int width) {
	this.width = width;
}
public void getArea() {
	System.out.println("area of rectangle: " + (length * width));
}
}
