package week2;

public class Mix {
	void mix(Number n) { System.out.println("Number");
	}

	void mix(Double d) { System.out.println("Double");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mix m = new Mix();
		 
		m.mix(10.5);

		}

	}


