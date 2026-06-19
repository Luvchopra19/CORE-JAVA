package DateFormates;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormate {
	
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		
		System.out.println(" DATE :)" + d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		// Convert Date in String Format
		
		String formatedDate = sdf.format(d);
		
		System.out.println(" String Formate :)" + formatedDate);
		
		System.out.println("----------------");
		
		String dob = "2005-10-19";
		
		System.out.println(" DOB :)" + dob);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		
		// Convert String format to date format 
		
		Date dateDob = sdf1.parse(dob);
		
		System.out.println("DATE FORMATE :)" + dateDob);
	}

}