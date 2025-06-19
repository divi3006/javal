package Week3;
class Rbi{
	int intrest=7;
	int amount=10000;
	void CalcInt() {
		System.out.println("No intrest for my bank");
	}
		// TODO Auto-generated method stub
}
class Hdfc extends Rbi{
	void CalcInt() {
		super.CalcInt();
		System.out.println(super.intrest*amount);
	}}
class Icici extends Rbi{
	void CalcInt() {
		System.out.println(8*amount);
	}}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rbi h=new Hdfc();
h.CalcInt();
Rbi i=new Icici();
i.CalcInt();
	}}
