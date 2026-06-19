package Inheritance;

import java.util.Date;

public class Person {
	
	protected String name;
	protected String address;
	protected Date dob;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getdob() {
		return this.dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

}
