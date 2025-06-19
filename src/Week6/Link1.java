package Week6;
import java.util.Iterator;
import java.util.LinkedList;
public class Link1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer>a=new LinkedList();
		LinkedList <Integer>a1=new LinkedList();
		a.add(2);
		a.add(4);
		a.add(6);
		a.add(8);
		a.add(10);
		a.add(12);
		a.add(14);
		System.out.println(a);
		a.add(1,3);
		a.add(3,5);
		System.out.println(a);
		System.out.println(a.get(4));
		a.set(5, 7);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a1.addAll(a);
		System.out.println(a1);
a.clear();
System.out.println(a);
a.removeIf(e->e>3);
System.out.println(a);
System.out.println(a1.contains(2));
System.out.println(a1.indexOf(6));
System.out.println(a1.isEmpty());
System.out.println(a.isEmpty());
System.out.println(a1.size());
System.out.println(a1.subList(0, 3));
a1.add(12);
System.out.println(a1);
System.out.println(a1.lastIndexOf(12));
a1.sort(null);
System.out.println(a1);
Iterator<Integer>it=a1.iterator();
while(it.hasNext()) {
	int num=it.next();
	if(num==2) {
		it.remove();
		System.out.println(it.next());
	}
}System.out.println(a1);

	}

}
