package Week4;

import java.io.File;

public class FileD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     File f = new File("StudentInfo.csv");
			  if (f.delete()) {
		  System.out.println("Delete");
	 } else {
		System.out.println("File already exists");		 
	}
	}
}
