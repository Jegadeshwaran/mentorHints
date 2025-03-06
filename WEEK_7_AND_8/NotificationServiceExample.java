package WEEK_7_AND_8;


interface NotificationService{
    void sendNotification(String message);
    void getStatus();
}

class EmailNotification implements NotificationService{
	String status = "Not received";
	public void sendNotification(String message) {
		System.out.println(message);
		status = "Received";
	}
	public void getStatus() {
		System.out.println(status);
	}
}
class SMSNotification implements NotificationService{
	String status = "Not received";
	public void sendNotification(String message) {
		System.out.println("SMS notification");
		status = "Received";
	}
	public void getStatus() {
		System.out.println(status);
	}
}
public class NotificationServiceExample {

	public static void main(String[] args) {
		NotificationService email = new EmailNotification();
		
		NotificationService sms = new SMSNotification();
		email.sendNotification("email notification");
		email.getStatus();
		
		sms.sendNotification("sms notification");
		sms.getStatus();
	}

}
