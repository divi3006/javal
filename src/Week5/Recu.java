package Week5;

public class Recu {
static int factorial(int a) {
	if(a==1) {
		return 1;
}
	else {
	return a*factorial(a-1);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int number=3;
	int result=factorial(number);
	System.out.println("Factorial of"+number+"is:"+result);
}
} 