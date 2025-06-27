package Week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stre1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> a=new ArrayList<Integer>();
a.add(1);
a.add(3);
a.add(5);
a.add(7);
a.add(9);
List<Integer>a1=a.stream().map(e->e+3).collect(Collectors.toList());
System.out.println(a1);
List<Integer>a2=a.stream().filter(s->s<10).collect(Collectors.toList());
 System.out.println(a2);
 boolean Value=a.stream().map(e->e+5).allMatch(e->e<10);
 System.out.println(Value);
 boolean isAvail=a.stream().map(e->e+5).anyMatch(e->e<10);
 System.out.println(isAvail);
 Optional<Integer>a3=a.stream().filter(s->s<10).findFirst();
 System.out.println(a3);
 System.out.println(a3.get());
	}

}
