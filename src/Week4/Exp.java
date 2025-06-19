package Week4;

public class Exp {
void Propagation() {
	try
	{
		a1();
	}catch(Exception e) {
	}
	System.out.println("your order is placed successfully");
}
void a1() {
	a2();
	System.out.println(10/2);
	System.out.println("order shipped");
} 
void a2() {
	System.out.println(10/0);
	System.out.println("order delivered successfully");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Exp e=new Exp();
	e.Propagation();
	}
}
