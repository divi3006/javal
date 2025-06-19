package week2;

public class Overloading {
	void show(char c) { 
		System.out.println("char");
	}

	void show(int i) {
		System.out.println("int");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o = new Overloading(); 
		o.show('A');
	}

}
