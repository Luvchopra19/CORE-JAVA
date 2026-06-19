package Polimorphism;

public class TestPolymorphismByArray {
	public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
		
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Tringle();
		
		Circle c = (Circle)s[0];
		
		c.setRadius(5);
		c.area();
		
		Rectangle r = (Rectangle)s[1];
		
		r.setLength(6);
		r.setWidth(3);
		r.area();
		
		Tringle t = (Tringle)s[2];
		
		t.setBase(4);
		t.setHight(4);
		t.area();
	}

}
