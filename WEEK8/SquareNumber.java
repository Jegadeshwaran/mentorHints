package WEEK8;


class squareNumberThread implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i*i);
		}
	}
}
public class SquareNumber {

	public static void main(String[] args) {
		squareNumberThread sn = new squareNumberThread();
		
		Thread t1 = new Thread(sn);
		
		t1.start();

	}

}
