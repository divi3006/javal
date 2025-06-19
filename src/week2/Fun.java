package week2;

public class Fun {
	void m(Object o) { System.out.println("Object");
	}

	void m(String s) { System.out.println("String");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fun f = new Fun();
		f.m(null);
	}

}
