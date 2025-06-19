package Week6;

import java.util.HashMap;

public class HashM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,Integer>hmap=new HashMap();
hmap.put("Hema", 001);
hmap.put("Nivetha", 002);
hmap.put("Swetha", 003);
hmap.put("Divya", 004);
hmap.put(null,111);
System.out.println(hmap);
System.out.println(hmap.get(null));
System.out.println(hmap.getOrDefault("abcd", 123456));
System.out.println(hmap.getOrDefault("Nivetha", 123456));
System.out.println(hmap.containsKey("Hema"));
System.out.println(hmap.containsKey("abcd"));
System.out.println(hmap.containsValue(002));
System.out.println(hmap.containsValue(005));
System.out.println(hmap.size());
System.out.println(hmap.values());
System.out.println(hmap.entrySet());
System.out.println(hmap.keySet());
	}
}
