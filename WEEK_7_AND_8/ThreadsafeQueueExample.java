package WEEK_7_AND_8;

import java.util.LinkedList;
import java.util.Queue;

class ThreadsafeQueue<T>{
	private final Queue<T> queue;
	private final int capacity;
	
	public ThreadsafeQueue(int capacity) {
		this.queue = new LinkedList<>();
		this.capacity = capacity;
	}
	
	public synchronized void enqueue(T item) throws InterruptedException {
		if(queue.size() == capacity) {
			System.out.println(Thread.currentThread().getName()+"queue is waiting for remove existing item");
			wait();
		}
		queue.add(item);
		System.out.println(Thread.currentThread().getName()+"enqueued "+item);
		notifyAll();
	}
	public synchronized void dequeue() throws InterruptedException {
		if(queue.isEmpty()) {
			System.out.println(Thread.currentThread().getName()+"queue is waiting for add new data");
			wait();
		}
		T i = queue.poll();
		System.out.println(Thread.currentThread().getName()+"Dequeued "+i);
		notifyAll();
	}
}

class producer extends Thread{
	private final ThreadsafeQueue<Integer> queue;
	
	public producer(ThreadsafeQueue<Integer> queue,String name) {
		super(name);
		this.queue = queue;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				queue.enqueue(i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class consumer extends Thread{
	private final ThreadsafeQueue<Integer> queue;
	
	public consumer(ThreadsafeQueue<Integer> queue,String name) {
		super(name);
		this.queue = queue;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				queue.dequeue();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadsafeQueueExample {

	public static void main(String[] args) {
		ThreadsafeQueue<Integer> queue = new ThreadsafeQueue<>(3);
		
		producer producer1 = new producer(queue,"producer-1");
		producer producer2 = new producer(queue,"producer-2");
		consumer consumer1 = new consumer(queue,"consumer-1");
		consumer consumer2 = new consumer(queue,"consumer-2");
		
		producer1.start();
		producer2.start();
		consumer1.start();
		consumer2.start();
	}

}
