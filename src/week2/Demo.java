package week2;

public class Demo {
	static void print(int a, long b) 
	{
		System.out.println("int-long");
	}

	static void print(long a, int b) 
	{
		System.out.println("long-int"); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10, 20); // ambiguity?

	}

}
