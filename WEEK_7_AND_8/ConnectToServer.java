package WEEK_7_AND_8;

import java.util.Random;

class ConnectionFailedException extends Exception{
	public String getMessage() {
		return "Connection Failed Server Not Reachable";
	}
}

class Server{
	public static final int max = 3;
	public static final Random random = new Random();
	int attempt =0;
	public void connect() {
		attempt++;
		if(random.nextBoolean()) {
			System.out.println("connected successfully");
			return;
		}
		else {
			ConnectionFailedException c = new ConnectionFailedException();
			System.out.println(c.getMessage());
			if(attempt == max) {
				System.out.println("you have reached maximum limit Try after some time");
			}
		}
		if(attempt != max) {
			connect();
		}
	}
	
}
public class ConnectToServer {

	public static void main(String[] args) {
		Server s = new Server();
		s.connect();

	}

}
