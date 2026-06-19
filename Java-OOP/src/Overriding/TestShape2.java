package Overriding;

public class TestShape2 {
public static void main(String[] args) {
	
	System.out.println("--------CIRCLE----------"); 
	
	// parent can keep child's refernce
	Shape s1 = new Circle();
	
	// type cast shape s1 to circle c
	Circle c = (Circle)s1;
	c.setColor("Red");
	c.setBoderWidth(2);
	c.setRadius(6);
	
	System.out.println("Color: " + c.getColor());
	System.out.println("BoderWidth: " + c.getBoderwidth());
	System.out.println("Radius: " + c.getRadius());
	c.area();
	
	System.out.println("----------RECTANGLE----------");
	
	Shape s2 = new Rectangle();
	
	Rectangle r = (Rectangle)s2;
	
	r.setColor("red");
	r.setBoderWidth(3);
	r.setLength(5);
	r.setWidth(2);
	
	System.out.println("Color: " + r.getColor());
	System.out.println("BoderWidth: " + r.getBoderwidth());
	System.out.println("Length: " + r.getLength());
	System.out.println("Width: " + r.getWidth());
	r.area();
	
	System.out.println("--------Tringle--------");
	
	Shape s3 = new Tringle();
	
	Tringle t = (Tringle)s3;
	
	t.setColor("red");
	t.setBoderWidth(3);
	t.setBase(4);
	t.setHight(6);
	
	System.out.println("Color: " + t.getColor());
	System.out.println("BoderWidth: " + t.getBoderwidth());
	System.out.println("Base: " + t.getBase());
	System.out.println("Hight: " + t.getHight());
	t.area();

}
}
