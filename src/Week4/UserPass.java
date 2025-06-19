package Week4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class UserPass {
	

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File f=new File("StudentLogin.text");
		if(f.createNewFile()) {
	}		FileWriter fwrite=new FileWriter(f);
	fwrite.append("abc,123");
	fwrite.close();
System.out.println("Enter your username:");
}
}