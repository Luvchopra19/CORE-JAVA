package Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
public static void main(String[] args) throws ParseException {
	
	System.out.println("-------businessman--------");
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-MM");
	
	Businessman b1 = new Businessman();
	
	b1.setName("Shyam");
	b1.setAddress("Indore");
	b1.setDob(sdf.parse("2001-19-04"));
	b1.setIncome(100000.00);
	
	System.out.println("Name: " + b1.getName());
	System.out.println("Address: " + b1.getAddress());
	System.out.println("Dob: " + b1.getdob());
	System.out.println("Income: " + b1.getIncome());
	
	System.out.println("--------Doctor");
	
	Doctor d1 = new Doctor();
	
	d1.setName("Shyam");
	d1.setAddress("Indore");
	d1.setDob(sdf.parse("2002-25-10"));
	d1.setResistretion("1029384756");
	
	System.out.println("Name: " + d1.getName());
	System.out.println("Address: " + d1.getAddress());
	System.out.println("Dob: " + d1.getdob());
	System.out.println("ResistretionNo: " + d1.getResistretion());
	
	System.out.println("------Studend---------");
	
	Student s1 = new Student();
	
	s1.setName("Shyam");
	s1.setAddress("Indore");
	s1.setDob(sdf.parse("2003-23-09"));
	s1.setRollNo("2365981245");
	s1.setMarks(299);
	
	System.out.println("Name: " + s1.getName());
	System.out.println("Address: " + s1.getAddress());
	System.out.println("Dob: " + s1.getdob());
	System.out.println("RollNO: " + s1.getRollNo());
	System.out.println("Marks: " + s1.getMarks());
}
}
