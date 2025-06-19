package Week4;

public class Manual {
	public Manual(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,2,3,4};
for(int i=0;i<a.length-1;i++) {
	try {
		if(a[i]<a[i+1]) {
			throw new Exception("testing");
		}
	}
		catch(Exception e) {
			e.printStackTrace();
	}
}
}
}