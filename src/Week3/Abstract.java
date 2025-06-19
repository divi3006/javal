package Week3;
abstract class Bird{
	abstract void Birdssound();
	void Sound() {
	System.out.println("Name and sounds of Birds");
}
	static void count (int a) {
	System.out.println("Birds Quantity:"+a);
	}
	}
class Bird1 extends Bird{
	@Override
	void Birdssound() {
		// TODO Auto-generated method stub
		System.out.println("Sparrow:"+"Chirp");
	}
}
class Bird2 extends Bird1{
	void Sound(){
		System.out.println("Parrot:"+"Talk");
	}
}
class Bird3 extends Bird2{
	void Sound(){
		System.out.println("Peacock:"+"Scream");
	}
}
public class Abstract {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bird1 b1=new Bird1();
b1.Birdssound();
Bird2 b2=new Bird2();
b2.Sound();
Bird3 b3=new Bird3();
b3.Sound();
Bird.count(1);
	}
}

