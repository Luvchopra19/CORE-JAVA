package IO;

import java.io.FileReader;

public class RedTextFile {
public static void main(String[] args) throws Exception{
	
	//red single charecter only as int
	FileReader file = new FileReader("D:\\IO\\Addition.txt");
	
	int i = file.read();
	
	while(i != -1) {
		System.out.println((char) i + " = " + i);
		i = file.read();
	}
	file.close();
}
}
