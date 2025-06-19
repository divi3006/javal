package Week3;

public class LinearSearch {
static	int findIndex(int[]arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		} 
		return-1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] arr= {2,4,6,8,10,12,7,14};
			System.out.println(findIndex(arr,6));
			System.out.println(findIndex(arr,10));
			System.out.println(findIndex(arr,15));
			System.out.println(findIndex(arr,7));

		}
}