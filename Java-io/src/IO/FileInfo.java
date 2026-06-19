package IO;

import java.io.File;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) {
		
		File file = new File("D:\\IO\\Io path.txt");// file open
		
		if(file.exists()) {
			System.out.println("file name: " + file.getName());
			System.out.println("file path: " + file.getPath());
			System.out.println("--------------------------------------");
			
			System.out.println("Access permission");
			System.out.println("writable: " + file.canWrite());
			System.out.println("Redable: " + file.canRead());
			System.out.println("--------------------------------------------");
			
			System.out.println("check if it is a folder/directory or a file");
			System.out.println("is file: " + file.isFile() );
			System.out.println("id folder/directory: " + file.isDirectory());
			System.out.println("------------------------------------------------");
			
			System.out.println("Last modified date of file, folder/directory");
			Date lastModifiedDate = new Date(file.lastModified());
			System.out.println("lastModifieddate: " + lastModifiedDate);
			System.out.println("Length: " + file.length());
		}else {
			System.out.println("File Not Found");
		}
	}
}
