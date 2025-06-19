package Week4;

public class Elements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,3,5,6,8,2,3,4,6,8,5};
for(int i=0;i<a.length;i++) {
	int c=0;
	for(int j=0;j<a.length;j++) {
		if(a[i]==a[j] && i!=j) {
			c++; 
		}
	}if(c>0) {
		System.out.println((a[i]));
		}
	}
}
}