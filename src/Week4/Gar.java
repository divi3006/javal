package Week4;

public class Gar {
public void finalize(){
	System.out.println("Good morning");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
Gar g=new Gar();
g=null;
System.gc();

	}
	}
}
