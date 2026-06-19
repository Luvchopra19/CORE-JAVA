package abstraction;

import Inheritance.Circle;
import Inheritance.Rectangle;
import Inheritance.Tringle;

public class TestShape {
public static void main(String[] args) {

	System.out.println("---------CIRCLE----------");
	
	Circle c1 = new Circle();
	
	c1.setBorderWidth(7);
	c1.setcolor("red");
	c1.setRadius(1);
	
	System.out.println("BorderWidth: " + c1.getBorderWidth());
	System.out.println("Color: " + c1.getcolor());
	System.out.println("radius: " + c1.getRadius());
	c1.getArea();
	
	System.out.println("---------RECTANGLE----------");
	
	Rectangle r1 = new Rectangle();
	
	r1.setLength(10);
	r1.setWidth(5);
	r1.setcolor("red");
	r1.setBorderWidth(2);
	
	System.out.println("Length: " + r1.getLength());
	System.out.println("Width: " + r1.getWidth());
	System.out.println("Color: " + r1.getcolor());
	System.out.println("BorderWidth: " + r1.getBorderWidth());
	r1.getArea();
	
	System.out.println("--------TRINGLE---------");
	
	Tringle t1 = new Tringle();
	
	t1.setBase(4);
	t1.setHeight(5);
	t1.setcolor("red");
	t1.setBorderWidth(3);
	
	System.out.println("Base: " + t1.getBase());
	System.out.println("Height: " + t1.getHeight());
	System.out.println("Color: " + t1.getcolor());
	System.out.println("BorderWidth: " + t1.getBorderWidth());
	t1.getArea();
}
}

