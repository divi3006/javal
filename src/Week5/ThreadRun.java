package Week5;

public class ThreadRun implements Runnable {
static int a=8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadRun t=new ThreadRun();
		Thread th=new Thread();
		Thread th1=new Thread();
		th.start();
		th1.start();
		System.out.println(a);
		a++;
		System.out.println(a);
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
a++;
}
}