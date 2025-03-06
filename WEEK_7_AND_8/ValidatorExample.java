package WEEK_7_AND_8;

interface validator{
	boolean validate(String input);
}

class Emailvalidator implements validator{
	public boolean validate(String input) {
		String email = "^[A-Za-z0-9+_.-]+@[A-Za-z.-]+$";
		return input.matches(email);
	}
}
class Phonevalidator implements validator{
	public boolean validate(String input) {
		String phone = "^[0-9]{10}$";
		return input.matches(phone);
	}
}
class Passwordvalidator implements validator{
	public boolean validate(String input) {
		String password = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,20}$";
		return input.matches(password);
	}
}
public class ValidatorExample {

	public static void main(String[] args) {
		validator e = new Emailvalidator();
		validator p = new Phonevalidator();
		validator pass = new Passwordvalidator();
		System.out.println(e.validate("jega@gmail.com"));
		System.out.println(p.validate("9876543210"));
		System.out.println(pass.validate("Jega@1234"));
	}

}
