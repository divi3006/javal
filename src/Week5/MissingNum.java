package Week5;

public class MissingNum {
	static void MissingNumber(int[]a) {
		int miss=a[0];
		for (int i=0;i<a.length;) {
					if(miss!=a[i]) {
						System.out.println(miss);
					}else {
						i++;
					}
				miss++;
				}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] b= {-2,6};
MissingNumber(b);
	}
	}
