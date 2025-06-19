package Week5;

public class Palindrome1 {
	static boolean isPalindrome(String s1) {
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s1.charAt(s1.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("madam"));
		System.out.println(isPalindrome("welcome"));
		System.out.println(isPalindrome("hi"));
	}

}
	