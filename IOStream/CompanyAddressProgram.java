package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Address implements Serializable{
	private String street;
	private String city;
	private int pincode;
	public Address(String street, String city, int pincode) {
		super();
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public Address() {
		
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
class Company implements Serializable{
	private String name;
	Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Company(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	
}
public class CompanyAddressProgram {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		Address address = new Address("Abc","bca",654321);
		
		Company company = new Company("xyz",address);
		
		FileOutputStream fileO = new FileOutputStream("company.ser");
		try {
			ObjectOutputStream o = new ObjectOutputStream(fileO);
			o.writeObject(company);
			o.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		FileInputStream fileI = new FileInputStream("company.ser");
        try (ObjectInputStream i = new ObjectInputStream(fileI)){
			Company reCom = (Company) i.readObject();
			Address add = reCom.getAddress();
			System.out.println(add.getCity());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
