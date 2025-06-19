package Week5;
import java.util.*;
class TestThread{
}
public class Threads2 extends Thread {
static int i=5;
TestThread common;
public Threads2(TestThread t3) {
	// TODO Auto-generated constructor stub
	this.common=t3;
}
public void run() {
	synchronized(common) {
	for(int i=0;i<5;i++) {
		System.out.println(Thread.currentThread());
	}
	}}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestThread t3=new TestThread();
		Threads2 t=new Threads2(t3);
		Threads2 t1=new Threads2(t3);
		t.setName("Divi");
		t1.setName("Nivi");
		t1.setPriority(3);
		t.start();
		t1.start();  
		System.out.println(Thread.currentThread());
t.join();
t1.join();
System.out.println("HELLO");
System.out.println(i);
System.out.println(i);
	}
	}
