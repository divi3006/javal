package Week5;

public class InnerC {
int a=10;
static class innerclass1{
	void a1() {
		System.out.println("this is my inner class");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
InnerC.innerclass1 i=new InnerC.innerclass1();
i.a1();
	}

}
