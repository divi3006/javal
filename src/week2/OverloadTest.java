package week2;

public class OverloadTest {
	void test(double d) {
		System.out.println("double");

		}

		void test(float f) { 
			System.out.println("float");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadTest o = new OverloadTest();
		o.test(5);
	}

}
