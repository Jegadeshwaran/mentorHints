package WEEK8;


class Odd extends Thread{
	private  int n=1;
	public synchronized void run() {
		for(int i=0;i<5;i++) {
			System.out.println(n);
			n = n+2;
		}
	}
}

class Even extends Thread{
	private  int n=0;
	public synchronized void run() {
		for(int i=0;i<5;i++) {
			System.out.println(n);
			n = n+2;
		}
	}
}
public class OddEvenUsingThread {

	public static void main(String[] args) {
		Odd o =new Odd();
		Even e = new Even();
		o.start();
		e.start();
	}

}
