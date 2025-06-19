package Week4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileBack {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f=new File("StudentInfo.csv");
Scanner sc=new Scanner(f);
String backup="";
	while(sc.hasNextLine()) {
		backup+=backup+sc.nextLine()+"\n";
	}
System.out.println("FileBackup");
Scanner sc1=new Scanner(System.in);
System.out.println("Enter your details");
String word=sc.nextLine();
FileWriter fWriter=new FileWriter(f);
fWriter.append(backup);
fWriter.append(word);
System.out.println("File Writen Successfully");
fWriter.close();
}
}
