package Week6;

sealed class Shape permits Circle,Square{
	public void PrintShape() {
		System.out.println("Shape1:"+ "Triangle");
	}
}
non-sealed class Circle extends Shape{
		public void PrintShape1() {
			System.out.println("Shape2:"+ "circle");
		}
}
final class Square extends Shape{
	public void PrintShape2() {
		System.out.println("Shape3:"+ "Square");
	}
}
public  class Sel{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape s=new Shape();
Circle c=new Circle();
Square s1=new Square();
s.PrintShape();
c.PrintShape1();
s1.PrintShape2();
	}
}
