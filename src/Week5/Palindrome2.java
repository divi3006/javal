package Week5;

public class Palindrome2 {
	static  int reverseNume(int n) {
		int result=0;
while(n>0) {
	result=result*10+(n%10);
	n=n/10;
}
return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		int n1=111;
	System.out.println(n==reverseNume(n));
	System.out.println(n1==reverseNume(n1));

}
	}

