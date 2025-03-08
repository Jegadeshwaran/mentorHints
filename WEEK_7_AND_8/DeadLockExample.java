package WEEK_7_AND_8;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;

class Resource1{
	private String name;
	Resource1(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class DeadLockThread extends Thread{
	private Resource1 firstResource;
	private Resource1 secondResource;
	
	public DeadLockThread(Resource1 firstResource,Resource1 secondResource) {
		this.firstResource = firstResource.getName().compareTo(secondResource.getName()) < 0 ? firstResource : secondResource;
		this.secondResource = (this.firstResource == firstResource) ? secondResource : firstResource;

	}
	
	public void run() {
		synchronized(firstResource) {
			System.out.println(Thread.currentThread().getName()+"locked"+firstResource.getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(secondResource) {
				System.out.println(Thread.currentThread().getName()+"locked"+secondResource.getName());
			}
		}
	}
}
public class DeadLockExample {
	
	public static void detectDeadLock() {
		ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
		long[] deadLockedThread = threadBean.findDeadlockedThreads();
		
		if(deadLockedThread != null) {
			System.out.println("DeadLock Detected"+Arrays.toString(deadLockedThread));
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		Resource1 resourceA = new Resource1("ResourceA");
		Resource1 resourceB = new Resource1("ResourceB");
		
		Thread thread1 = new DeadLockThread(resourceA,resourceB);
		Thread thread2 = new DeadLockThread(resourceB,resourceA);
		thread1.start();
		thread2.start();
		
		while(true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			detectDeadLock();
		}
	}

}
