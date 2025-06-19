package Week5;

public class Str {
static String s1="hi";
String substring(int start,int end) throws Exception {	
    if (start < 0) {
        throw new IndexOutOfBoundsException("start cannot be negative.");
	}
    if (end > s1.length()) {
        throw new IndexOutOfBoundsException("end cannot be greater than the string length.");
	}
	if (start==end) {
		return s1;
	}
    if (start > end) {
        throw new IndexOutOfBoundsException("start cannot be greater than end.");
}if (start==end) {
	return"";
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(s1);
	}
}
