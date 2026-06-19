package Overriding;

public class TestShape {
public static void main(String[] args) {
	
	System.out.println("--------CIRCLE----------"); 
	
	Circle c1 = new Circle();
	
	c1.setColor("Red");
	c1.setBoderWidth(2);
	c1.setRadius(6);
	
	System.out.println("Color: " + c1.getColor());
	System.out.println("BoderWidth: " + c1.getBoderwidth());
	System.out.println("Radius: " + c1.getRadius());
	c1.area();
	
	System.out.println("----------RECTANGLE----------");
	
	Rectangle r1 = new Rectangle();
	
	r1.setColor("red");
	r1.setBoderWidth(3);
	r1.setLength(5);
	r1.setWidth(2);
	
	System.out.println("Color: " + r1.getColor());
	System.out.println("BoderWidth: " + r1.getBoderwidth());
	System.out.println("Length: " + r1.getLength());
	System.out.println("Width: " + r1.getWidth());
	r1.area();
	
	System.out.println("--------Tringle--------");
	
	Tringle t1 = new Tringle();
	
	t1.setColor("red");
	t1.setBoderWidth(3);
	t1.setBase(4);
	t1.setHight(6);
	
	System.out.println("Color: " + t1.getColor());
	System.out.println("BoderWidth: " + t1.getBoderwidth());
	System.out.println("Base: " + t1.getBase());
	System.out.println("Hight: " + t1.getHight());
	t1.area();
}
}
