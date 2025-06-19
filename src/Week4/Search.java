package Week4;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {2,4,7,12,14,15,16,17};
int target=14;
int start=0;
int end=arr.length-1;
int mid=start+(end-start)/2;
while(start<end) {
	 mid=start+(end-start)/2;
	if(arr[mid]==target) {
		System.out.println(mid);
		break;
	}else if(target>arr[mid]) {
		start=mid;
	}else {
		end=mid;
	}
}
}
}