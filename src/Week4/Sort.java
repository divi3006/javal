package Week4;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {3,2,4,5,6,8,7,9};
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}System.out.println(Arrays.toString(a));
	}

}
