package Week4;
import java.util.*;
enum Token{
	ABC,
	DEF,
	GHI
}

public class EnToken {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in); 
while(true) {
	try {
		System.out.println("Enter Token");
		String token=sc.nextLine();
		Token t=Token.valueOf(token);
		System.out.println(Arrays.toString(Token.values()));
		break;
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	}

}
