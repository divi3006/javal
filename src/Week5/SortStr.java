package Week5;

public class SortStr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hello";
char[] c=s.toLowerCase().toCharArray();
for(int i=0;i<c.length;i++) {
	for(int j=i+1;j<c.length;j++) {
		if(c[i]>c[j]) {
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
		}
	}
	}System.out.println(c);
}
}
