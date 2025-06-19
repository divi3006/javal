package Week4;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int[] a= {1,2,3,4,5,6};
	System.out.println(a[8]);
}catch(Exception e) {
	e.printStackTrace();
}
finally {
	System.out.println("Welcome");
}
System.out.println("Hello");
	}

}
