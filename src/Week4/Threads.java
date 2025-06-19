package Week4;
public class Threads extends Thread {
static int i=5;
public void run() {
	for(int i=0;i<5;i++) {
		System.out.println(Thread.currentThread());
	}
		i++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads t=new Threads();
		t.start();
System.out.println("Hello world");
System.out.println(i);
i++;
System.out.println(i);
Threads t1=new Threads();
t1.start();
	}
	}

