package Week4;


import java.util.*;

public class Scan {
	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(true) {
try {
System.out.println("Enter any number");
	int n=sc.nextInt();
	System.out.println(n);
	break;
}catch(InputMismatchException e){
	System.out.println("ERROR:This not a valid integer");
	sc.next();
}
}
while(true) {
try {
	System.out.println("Enter any name");
	String s=sc.next();
	System.out.println(s);
	break;
		}catch(InputMismatchException e) {
			System.out.println("ERROR:This not a valid string");
			sc.nextLine();
			e.printStackTrace();
		}finally {
			System.out.println("process end");
		}	
sc.close();
}
}
}