package week2;

import java.util.List;
import java.util.stream.Collectors;

import Week6.Passenger;

public class Demo {
	static void print(int a, long b) 
	{
		System.out.println("int-long");
	}

	static void print(long a, int b) 
	{
		System.out.println("long-int"); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10, 20); // ambiguity?

	}

}
System.out.println("Enter your Pid");
int wlchecked=s.nextInt();
List<Passenger> isWlPass = wlPassengers.stream()
.filter(e->e.getPid() ==wlchecked)
.collect(Collectors.toList());
if(wlPassengers!= null && !wlPassengers.isEmpty()) {
	System.out.println("Booked Wl Limit"+isWlPass.get(0).getBkdwlLimit());
	System.out.println("Current Wl Limit"+isWlPass.get(0).getCurrentwlLimit());        }
	else {
		wlPassengers.forEach(e->e.getCurrentwlLimit());
	}