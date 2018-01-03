package Assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		User user1 = new User("sathya");
		User user2=new User("tarun");
		User user3= new User("piyuish");
		
		List<User> userList=new ArrayList<>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		Scanner sc=new Scanner(System.in);
		int z=1;
		do
		{
			System.out.println("\nWhich user you want to select\n");
			System.out.println("Press 1 for sathya\n");
			System.out.println("Press 2 for tarun\n");
			System.out.println("Press 3 for piyuish\n");
			System.out.println("Enter your choice of User\n");
			int choice = sc.nextInt();
			
			System.out.println("\n You have chosen *****"+userList.get(choice-1).getUserName()+"*****");
			
			System.out.println("\n*******MENU*******\n");
			System.out.println("1.Phone pad\n");
			System.out.println("2.Dial \n");
			System.out.println("3.Call History\n");
			System.out.println("4.Add Contact\n");
			System.out.println("5.Phone Book\n");
			System.out.println("6.Exit\n");
			
			System.out.println("Enter your choice of Function\n");
			int choice2=sc.nextInt();
			
			switch(choice2)
			{
			case 1:
				userList.get(choice-1).accessPhonepad();
				break;
			
			case 2:
				userList.get(choice-1).makeCall();
				break;
			
			case 3:
				userList.get(choice-1).getCallHistory();
				break;
			
			case 4:
				userList.get(choice-1).addContact();
				break;
				
			case 5:
				userList.get(choice-1).displayContacts();
				break;
				
			case 6:
				System.exit(1);
				break;
			}
		}while(true);
	}

}
