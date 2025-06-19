package Week3;
class Family{
 public void Father() {
	System.out.println("I am a Doctor");
}
}
class Family1 extends Family{
	public void Mother() {
		System.out.println("I am a Teacher");
	super.Father();
	}
}
class Family2 extends Family{
	public void Son() {
		System.out.println("I am a Scientist");
	}
}
class Family3 extends Family{
	public void Daughter() {
		System.out.println("I am an Engineer");
	}
}
public class Inheritance{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Family1 f1=new Family1();
	Family2 f2=new Family2();
	Family3 f3=new Family3();
	f1.Mother();
    f2.Son();
    f3.Daughter();
	}
}
