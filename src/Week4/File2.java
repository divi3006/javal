package Week4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class File2 {
	public static void main(String[] args ) throws IOException {
		File f=new File("test.txt");
		if(f.createNewFile()) {
			System.out.println("Created");
		}else {
			System.out.println("Already exists");
		}
		FileWriter fwrite=new FileWriter(f);
		//fwrite.append("This new text");
		//fwrite.append("\nThis new one");
	//	fwrite.close();
		Scanner sc=new Scanner(f);
		int c=0;
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
			c++;
			String word = sc.next();           // ✅ Now 'word' is declared and assigned
	        System.out.println(word);          // ✅ Now it works fine
	        System.out.println(word.length());
	        c+=word.length();
		}
	System.out.println(c);
	}

}