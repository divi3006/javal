 package Week3;
interface Calci{
	int a=30;
	int b=5;
	void Calc();
 default void calc1() {
}}
interface Calci1{
	void calc2();
	}
public class Interface implements Calci,Calci1{
	public void Calc() {
		// TODO Auto-generated method stub
		System.out.println(Calci.a);
}	
@Override
public void calc1() {
// TODO Auto-generated method stub
System.out.println("Addition:"+(a+b));
}
@Override
public void calc2() {
	// TODO Auto-generated method stub
	System.out.println("subraction:"+ (a-b));
}
public void calc3() {
	// TODO Auto-generated method stub
	System.out.println("multiplication:"+(a*b));
}
public void calc4() {
	// TODO Auto-generated method stub
	System.out.println("division:"+(a/b));
}
public static void main(String[] args) {
// TODO Auto-generated method stub
Interface i=new Interface();
i.Calc();
i.calc1();
i.calc2();
i.calc3();
i.calc4();
System.out.println("calculator");
}
}
