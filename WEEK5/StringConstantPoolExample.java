package WEEK5;

public class StringConstantPoolExample {

	public static void main(String[] args) {
		String s1="Jega";
		String s2=new String("Jega");
		if(s1==s2) {
			System.out.println("Strings reference are Same");
		}
		else {
			System.out.println("Strings reference are different");
		}
		if(s1.equals(s2)) {
			System.out.println("Strings are Same");
		}
		else {
			System.out.println("Strings are different");
		}
	}

}
