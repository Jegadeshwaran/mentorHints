package WEEK_7_AND_8;

import java.util.concurrent.locks.ReentrantLock;

class philosopher extends Thread{
	private int philosopherId;
	private ReentrantLock leftFork,rightFork;
	private int maxMeal;
	public philosopher(int id,ReentrantLock leftFork,ReentrantLock rightFork,int maxMeal) {
		this.philosopherId = id;
		this.leftFork = leftFork;
		this.rightFork = rightFork;
		this.maxMeal = maxMeal;
	}
	public void think() throws InterruptedException {
		System.out.println("philosopher"+philosopherId+" is thinking...");
		Thread.sleep(1000);
	}
	public void eat() throws InterruptedException {
		System.out.println("philosopher"+philosopherId+" is eating...");
		Thread.sleep(2000);
	}
	public void run() {
		try {
			for(int i=0;i<maxMeal;i++) {
				think();
				leftFork.lock();
				try {
					rightFork.lock();
			      try {
			    	  eat();
			      }finally {
			    	  rightFork.unlock();
			      }
				}finally {
					leftFork.unlock();
				}
			}
				System.out.println("philosopher"+philosopherId+" has finished eating");
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
public class DiningPhilosopherProblem {

	public static void main(String[] args) {
		final int numphilosophers = 5;
		int maxMeal = 3;
		ReentrantLock[] forks = new ReentrantLock[numphilosophers];
		
		philosopher[] philosophers = new philosopher[numphilosophers];
		
		for(int i=0;i<numphilosophers;i++) {
			forks[i] = new ReentrantLock();
		}
		
		for(int i=0;i<numphilosophers;i++) {
			philosophers[i] = new philosopher(i,forks[i],forks[(i+1)%numphilosophers],maxMeal);
			philosophers[i].start();
		}
		

	}

}
