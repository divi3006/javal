package week2;

public class Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(10>5) {
			System.out.println("welcome");
		}
		if(5>10) {
			System.out.println("Hello");	
		}else
		{
			System.out.println("Hi");
		}
		for(int i=0;i<2;i++) {
			System.out.println("Good Morning");
		}
		int a[] = {2,4,6,8,10,12,14};
		for(int i=0;i<a.length;i++)
		{
			if(i==3) {
				continue;
			}
		System.out.println("Have A Nice Day"+a[2]);
		}
		int j=0;
		while(j<a.length) {	
			if (j==2) {
				break;
			}
			System.out.println("Good Noon");
		j++;
		}
		do
		{
			System.out.println("Thanks");
		}
		while(8<2);
		System.out.println("Thank You All");
}
}


		
		
		
		
		
		
		
		