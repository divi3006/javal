package Week5;

public class StringBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer("Welcome");
System.out.println(sb);
sb.insert(7, " all");
System.out.println(sb);
sb.replace(0, 7, "Hello");
System.out.println(sb);
sb.delete(6, 9);
System.out.println(sb);
sb.deleteCharAt(4);
System.out.println(sb);
}
}
