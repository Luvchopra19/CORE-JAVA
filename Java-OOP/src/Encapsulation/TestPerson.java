package Encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
public static void main(String[] args) throws ParseException {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date d = new Date();
	
	 Person p1 = new Person();
	 
	 Date now = new Date();
	 
	 p1.setName("Luv");
	 p1.setDob(sdf.parse("2005-05-05"));
	 p1.setAddress("Indore");
	 
	 System.out.println("Person Name: " + p1.getName());
	 System.out.println("Person Dob: " + p1.getDob());
	 System.out.println("Person Address: " + p1.getAddress());
	System.out.println (p1.getAge(p1.getDob()));
	
}
}
