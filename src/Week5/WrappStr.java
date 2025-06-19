package Week5;

import java.util.Arrays;
public class WrappStr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is my java program ";
String[] arr=s.split(" ");
System.out.println(Arrays.toString(arr));
char[] arr1= {'h','e','l','l','o'};
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]+":"+arr[i].length());
}
System.out.println(s.indexOf("s"));
System.out.println(s.lastIndexOf("s"));
System.out.println(s.charAt(2));
System.out.println(s.startsWith("t"));
System.out.println(s.endsWith("a"));
System.out.println(s.contains("my"));
String h="wo";
h+="rld";
String k="   world   ";
System.out.println(k.equals(h));
System.out.println(s.substring(8, 16));
System.out.println(s.concat("new"));
System.out.println(k.length());
System.out.println(k.trim());
System.out.println(k.trim().length());
System.out.println(s.replace("program", "programs"));
	}
	}
