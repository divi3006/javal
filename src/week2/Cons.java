package week2;
public class Cons{
String name;
public Cons(String s) {
	name=s;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cons c = new Cons("java");
Cons c1 = new Cons("JavaC");
Cons c2=new Cons("Python");
System.out.println(c.name);
System.out.println(c1.name);
System.out.println(c2.name);
	}
}
