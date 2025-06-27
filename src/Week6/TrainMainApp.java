package Week6;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TrainMainApp {
	static int availableTickets=3,upper=1,lower=1,middle=1,wlLimit=0;//available ticket reduce agaum podhu wllimit increase
	static int pid=1;
	static List<Passenger>bkdpassengers=new ArrayList<Passenger>();
	static List<Passenger>wlPassengers=new ArrayList<Passenger>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to Train Booking");//welcome message
Scanner s=new Scanner(System.in);//buy a input from user
String isContinue="Y";//
while(isContinue.equalsIgnoreCase("Y")) {//
System.out.println("1.Book Ticket\n2.Cancel\n3.View\n4.WL Status");//4 choice in my trainMain app
	System.out.println("Enter Your Choice");
	int choice=s.nextInt();//asking choice from user
	switch(choice) {//choice handle with switch case// switch multiple possible values check pannamudiyum
	case 1://BookTicket
		System.out.println("Enter your name");
		s.nextLine();
		String Pname=s.nextLine();//asking user name
		Berth berth=null;//berth initialized ippodhaikku  value illa but nan book pannuven
		while(true) { //	if condition is true  while loop run
			try {
		System.out.println("Enter your PrefBerth"+Arrays.toString(Berth.values()));//shows what berths are inside your enum
		String PrefBerth=s.nextLine();// asking berth													
        berth = Berth.valueOf(PrefBerth);//scanner buy a input from user in string we convert string into enum for constant 
		break;
			}catch(Exception e) {
				System.out.println("Invalid Enum");//if user give a wrong enum  while loop stop the condition and print this msg
			}
		}
		Passenger p=new Passenger();//class reference created for passenger class
		p.setPid(pid);
		p.setPassengerName(Pname);//we already buy a name and berth from user,for that we set this details from one id 
		p.setPrefBerth(berth);
		bookticket(p);//we creates a method
		pid++;//if 1 passenger booked we increase passenger id
		break;//method step into/ step over next line
	case 2://ticket cancellation 
		System.out.println("Enter your Pid");
		int Passid=s.nextInt();//asking user pid
		CancelTicket(Passid);//create method from passenger id
		break;
	case 3:
		System.out.println("Waiting List Passengers"+wlPassengers);//shows wlp details
		System.out.println("Booked List Passengers"+bkdpassengers);//shows bkdp details
		break;
	case 4:	//wl status check		
		System.out.println("Enter your Pid");
		int Wlchecked=s.nextInt();//asking passenger id
        List<Passenger> isWlPass = wlPassengers.stream()
	            .filter(e->e.getPid() ==Wlchecked)//here fileter wl passenger and check the give id is there or not in waiting list
	            .collect(Collectors.toList());
       if( isWlPass!=null && !isWlPass.isEmpty()) { //somebody in  wl only
			System.out.println("Booked Wl Limit" +isWlPass.get(0).getBkdwlLimit());//get bkdwl from wlpass that is a bktwl limit
			System.out.println("Current Wl Limit"+isWlPass.get(0).getCurrentwlLimit());//
       }else {   
    	   System.out.println("your id is not in WL");//the given id is not in wl means show this msg
       break;
       }
			default:	
		System.out.println("Invalid Option");//unknown wl id
	}
	System.out.println("Do you want to continue Y/N");//yes means/no stoped 
	isContinue=s.next();
	}
	}
	private static void CancelTicket(int passid) {
		// TODO Auto-generated method stub
	    List<Passenger> isBkdPass = bkdpassengers.stream()
	            .filter(e->e.getPid() == passid)
	            .collect(Collectors.toList());//hear we filter bkdpassenger  and check getPid is equals to passid
	        List<Passenger> isWlPass = wlPassengers.stream()
	            .filter(e->e.getPid() == passid)
	            .collect(Collectors.toList());//hear we filter wlpassenger  and check getPid is equals to passid
		if(isBkdPass!=null && !isBkdPass.isEmpty()) {// if bkdpass not equals null and not empty means somebody there either bkdp or wlp
			if(wlLimit>0) {//if wllimit greater than zero
				System.out.println("there are person is wl");//shows this message
				wlPassengers.get(0).setAllocatedBerth(isBkdPass.get(0).getAllocatedBerth());//we allocateberth for wlp
				bkdpassengers.removeIf(e->e.getPid()==passid);//cancel person pid=passid bkdp remove
				bkdpassengers.add(wlPassengers.get(0));//wlp add to bkdp
				System.out.println("Your ticket got confirmed"+wlPassengers.get(0).getPassengerName());//shows message to waiting list passenger
				wlPassengers.remove(0);// wl passenger remove if 3 wl means 1 move to bkdlist so remove oneperson
				wlPassengers.forEach(e->e.setCurrentwlLimit(e.getCurrentwlLimit()-1));
				wlLimit--;//here wlpass replace to bkdpass so we reduce waiting limit
			}else { //bkdpassenger=1 person wlLimit=0 so we increase ticket++
					bkdpassengers.removeIf(e->e.getPid()==passid);//here no one is waiting list but bkd passenger cancel the ticket 
					if(isBkdPass.get(0).getAllocatedBerth().equals(Berth.UPPER)) {//we get bkdpass berth
				upper++;// increase berth
					}
				availableTickets++;//ticket one increase 
			}
		}else if(isWlPass != null && !isWlPass.isEmpty()) {//canceled person in wl only
				System.out.println("Cancelling Wl passenger");//print this message
				wlPassengers.removeIf(e->e.getPid()==passid);//cancel person pid=passid wlp remove
				wlLimit--;		//reduce waiting list
		}else {
			System.out.println("Invalid Passenger");// id is not bkdp and wlp showthis msg
		}
	}
		
	static void allocatedBerth(Passenger p) {
		switch(p.getPrefBerth()) {//here  get berth from passenger
		case UPPER://is upper
			if(upper>0) {//if  condtion upper greater than zero
				p.setAllocatedBerth(Berth.UPPER);;//we allocateberth upper means
				upper--;//one berth is allocate to the user so we reduce upperberth:
			}else if(middle>0) {
				p.setAllocatedBerth(Berth.MIDDLE);
				middle--;
			}else {
				p.setAllocatedBerth(Berth.LOWER);
				lower--;
			}
		case LOWER:
			if(lower>0) {
				p.setAllocatedBerth(Berth.LOWER);;
				lower--;
			}else if(upper>0) {
				p.setAllocatedBerth(Berth.UPPER);
				upper--;
			}else {
				p.setAllocatedBerth(Berth.MIDDLE);
				middle--;
			}
		case MIDDLE:
			if(middle>0) {
				p.setAllocatedBerth(Berth.MIDDLE);;
				middle--;
			}else if(lower>0) {
				p.setAllocatedBerth(Berth.LOWER);
				lower--;
			}else {
				p.setAllocatedBerth(Berth.UPPER);
				upper--;
			}
			bkdpassengers.add(p);//add 1 passenger from booked passenger list
			availableTickets--;//at=3 1 passenger booked we reduce(1) at=2
			break;
		}
	}
	private static void bookticket(Passenger p) {
		// TODO Auto-generated method stub
		if(availableTickets>0) {//if availableTicket greater than 0
			allocatedBerth(p);//we allocateBerth for Passenger
			p.setBkdDt(LocalDateTime.now());//time set
			System.out.println("Ticket Booked");//inform to passenger ticketBooked
		}else if(wlLimit<3){//incase availableticket>0 alreadybooked so we check wlLimit<3
		wlPassengers.add(p);//add passengers to waiting list
		p.setBkdwlLimit(wlLimit);//pass add pandradhukkumunnadi bkdlimit  ah wllimit set pandrom
		p.setCurrentwlLimit(wlLimit);//add current limit waitlimit la set pandrom
		wlLimit++;//increase limit
		System.out.println("Ticket in WL");// and inform to passenger 
	}else {
		System.out.println("regret");//waiting full ayiduchu
	}
	}
}
