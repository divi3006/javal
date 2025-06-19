package Week6;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer>a=new HashSet();
a.add(1);
a.add(1);
a.add(2);
a.add(3);
a.add(2);
a.add(4);
a.add(5);
System.out.println(a);
a.remove(5);
System.out.println(a);
System.out.println(a.contains(2));
System.out.println(a.isEmpty());
System.out.println(a.size());
	}
}