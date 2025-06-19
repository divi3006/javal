package Week3;
interface Calcii{
	int a=30;
	int b=5;
	void Calc();
 default void calc1() {
}
}
interface Calcii1{
	
	void calc2();
	}
public class Inter implements Calcii,Calcii1{
	public void Calc() {
		// TODO Auto-generated method stub
		System.out.println(Calci.a);
}	
	@Override
	public void calc2() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Inter i=new Inter();
i.Calc();
}
}


