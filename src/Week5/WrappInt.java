package Week5;

public class WrappInt {
	static Integer a=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a.compareTo(10));
		System.out.println(a.compareTo(2));
		System.out.println(a.compareTo(5));
		System.out.println(a.doubleValue());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.max(10, 15));
		System.out.println(Integer.min(15, 5));
		System.out.println(Integer.compare(10,15));
		System.out.println(Integer.compareUnsigned(-15,-30));
		System.out.println(Integer.compareUnsigned(8, -3));
	}

}
