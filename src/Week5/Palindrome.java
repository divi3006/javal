package Week5;

public class Palindrome {
	static boolean isPalindrome(String s1) {
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		return s1.equals(sb.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("AMMA"));
		System.out.println(isPalindrome("HELLO"));
		System.out.println(isPalindrome("LEVEL"));
	}

}
	