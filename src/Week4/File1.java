package Week4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class File1 {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		      File f = new File("StudentInformation.csv");
		  if (f.createNewFile()) {
	  System.out.println("File created");
 } else {
	System.out.println("File already exists");
		            }
 //  FileWriter fWriter=new FileWriter(f);
   //fWriter.append("Name,Regno,Subject,Mark\nNivetha,2025,Java,80,\nDivya,2024,Python,80");
	 //  System.out.println("File Writen Successfully");
//	  fWriter.close();
	Scanner sc=new Scanner(f);
	int c=0;
	while(sc.hasNextLine()) {
		String Word=sc.nextLine();
		System.out.println(Word);
		System.out.println(Word.length());
		c+=Word.length();
	}
	System.out.println(c);
}
}