package WEEK8;


class ExampleThread extends Thread{
	public void run() {
		try {
			System.out.println("current Thread"+Thread.currentThread().getName());
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class ThreadJoining {

	public static void main(String[] args) {
		ExampleThread e1 = new ExampleThread();
		ExampleThread e2 = new ExampleThread();
		
		e1.start();
		e2.start();
		
		try {
			e1.join();
			e2.join();
			System.out.println("currentThread" + Thread.currentThread().getName());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
