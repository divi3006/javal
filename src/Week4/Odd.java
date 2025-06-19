package Week4;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {3,2,4,1,5,6,7,8,9,10};
		System.out.print("Odd numbers in the array: ");
		for (int number : a) {
		    if (number % 2 != 0) {
		        System.out.print(number + " ");
		    }
		}
		System.out.println();
	}

}
