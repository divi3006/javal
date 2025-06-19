package Week5;

import java.util.ArrayList;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>a=new ArrayList();
		ArrayList<String>a1=new ArrayList();
a.add("Hello");
a.add("Good");
a.add("morning");
a.add("Have");
a.add("Nice");
a.add("Day");
System.out.println(a);
System.out.println(a.get(1));
a.set(1,"Welcome");
a.set(2, "All");
System.out.println(a);
a.remove(1);
a.remove(2);
System.out.println(a);
a1.addAll(a);
System.out.println(a1);
a.clear();
System.out.println(a1);
a.removeIf(e->e.contains(e));
System.out.println(a);
	}

}
