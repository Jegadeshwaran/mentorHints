package WEEK_7_AND_8;

class Resource{
	private boolean isWriting = false;
	private int readers = 0;
	private String data = "Initial data";
	
	public synchronized void startRead(int readerId) throws InterruptedException {
		while(isWriting) {
			wait();
		}
		readers++;
		System.out.println("Reader "+readerId+" is reading"+data);
	}
	public synchronized void stopRead(int readerId) {
		readers--;
		System.out.println("Reader "+readerId+" is stop reading");
		if(readers == 0) {
			notifyAll();
		}	
	}
	public synchronized void startWrite(int writerId) throws InterruptedException {
		while(readers>0 || isWriting) {
			wait();
		}
		isWriting = true;
		System.out.println("Writer"+writerId +"is writing...");
	}
	public synchronized void stopWrite(int writerId) {
		isWriting = false;
		System.out.println("Writer"+writerId+" finished writing.");
		notifyAll();
	}
}

class Reader1 extends Thread{
	private Resource resource;
	private int readerId;
	
	public Reader1(Resource resource,int readerId) {
		this.resource = resource;
		this.readerId = readerId;
	}
	
	public void run() {
		try {
			resource.startRead(readerId);
			Thread.sleep(500);
			resource.stopRead(readerId);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class Writer1 extends Thread{
	private Resource resource;
	private int writerId;
	
	public Writer1(Resource resource,int writerId) {
		this.resource = resource;
		this.writerId = writerId;
	}
	
	public void run() {
		try {
			resource.startWrite(writerId);
			resource.stopWrite(writerId);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class ReaderWriterExample {

	public static void main(String[] args) {
		Resource resource = new Resource();
         Reader1 reader1 = new Reader1(resource,1);
         Reader1 reader2 = new Reader1(resource,2);
         Reader1 reader3 = new Reader1(resource,3);
         Writer1 writer1 = new Writer1(resource,1);
         Writer1 writer2 = new Writer1(resource,2);
         
         writer1.start();
         writer2.start();
         reader1.start();
         reader2.start();
         reader3.start();
         
	}

}
