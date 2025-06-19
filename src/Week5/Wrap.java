package Week5;

public class Wrap {
	static Integer s=8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String s="jf2#j 4%i 2@";
//int l=0,d=0,s1=0,s2=0;
//for(int i=0;i<s.length();i++) {
//	char c1=s.charAt(i);
//			if(Character.isLetter(c1)) {
	//			l++;
		//	}else if(Character.isDigit(c1)){
			//	d++;
			//}else if(Character.isWhitespace(c1)) {
				//s2++;
			//}else {
				//s1++;
			//}
//}System.out.println("Letter->"+l);
//System.out.println("digit->"+d);
//System.out.println("space->"+s2);
//System.out.println("symbol->"+s1);
	System.out.println(s.compareTo(20));
	System.out.println(s.doubleValue());
	System.out.println(Integer.max(25,32));
	System.out.println(Integer.min(35, 22));
	System.out.println(Integer.compare(30, 7));
	System.out.println(Integer.compareUnsigned(35,25));
	}
}
