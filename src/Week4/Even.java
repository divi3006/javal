package Week4;

public class Even {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=2345678;
while(num>0) {
	int EvenNum =num%10;
	if (EvenNum %2==0) {	
	System.out.println(EvenNum);
}
	num=num/10;
	}
	}
}
