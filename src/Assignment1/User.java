package Assignment1;

import java.util.Scanner;

public class User {
	
	public String userName;
	public Phone phone;
	Scanner sc= new Scanner(System.in);
	
	//Constructor
	public User(String userName) {
		super();
		this.userName = userName;
		phone = new Phone();
	}

	//Getters and Setters
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	//Use PhonePad
	public void accessPhonepad()
	{
		phone.pressButtons();
	}
	
	//Make a Call
	public void makeCall()
	{
		System.out.println("Enter the number you want to dial!\n");
		String number=sc.next();

		if(!number.matches("\\d{10}"))
		{
			System.err.println("Invalid Number");
			return;
		}
		phone.outGoing(number);
	}
	
	//Get call history
	public void getCallHistory()
	{
		System.out.println("\n*******Recent Contacts*******\n");
		phone.callHistory();
	}	
	
	//Add a contact
	public void addContact()
	{
		System.out.println("\nEnter the Contact Name!");
		String name=sc.next();
		System.out.println("\nEnter the Number!");
		String number = sc.next();
		phone.addContact(name, number);
	}
	
	//Display contacts
	public void displayContacts()
	{
		System.out.println("\n*******Contacts********\n");
		phone.showContacts();
	}
}
