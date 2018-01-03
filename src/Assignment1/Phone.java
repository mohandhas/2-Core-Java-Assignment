package Assignment1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;


public class Phone implements Functions{

	Map<String, Long> callHistory = new HashMap<String,Long>();
	SortedMap<String, String> contacts = new TreeMap<String, String>();
	Set<?> s=contacts.entrySet();
	Scanner sc=new Scanner(System.in);
	
	//constructor
	public Phone() 
	{
		// TODO Auto-generated constructor stub
	}

	//over ridden methods
	
	//dialpad
	@Override
	public void pressButtons() 
	{
		// TODO Auto-generated method stub
		System.out.println("1    2    3"
						+  "\n4    5    6"
						+  "\n7    8    9"
						+  "\n*    0    #");
	}
	
	//Make A Call
	@Override
	public void outGoing(String number) 
	{
		// TODO Auto-generated method stub
		//Making a call
		System.out.println("\nCalling to "+number+".......");
		
		//waiting for 2 seconds to the call get connected
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		//call connected
		System.out.println("\nCall connected!");
		
		//storing the called time
		long calledTime=	System.currentTimeMillis();
		
		//button to cut the call
		System.out.println("\nPress 1 to cut the call!");
		
		//waits until 1 pressed
		int cutTheCall=sc.nextInt();
		
		//if 1 presses
		if(cutTheCall==1)
		{
			//getting the current time
			long currentTime=System.currentTimeMillis();
			
			//subtracting the current time and prior time
			long diff=currentTime-calledTime;
			
			//convert to seconds
			long difff=TimeUnit.MILLISECONDS.toSeconds(diff);
			
			//update call history table
			callHistory.put(number,difff);
		}
		
		//Call ends
		System.out.println("\n Call Ended!");
	}

	//call history
	@Override
	public void callHistory() 
	{
		// TODO Auto-generated method stub
		Set keys=callHistory.keySet();
		
		for (Iterator i = keys.iterator(); i.hasNext(); ) 
		{
		       String key = (String) i.next();
		       long value = (long) callHistory.get(key);
		       System.out.println("Number: "+key+"\tDuration: "+value+" secs");
		}
	}

	//add contact
	@Override
	public void addContact(String name,String phone) 
	{
		// TODO Auto-generated method stub
		contacts.put(name,phone);
		System.out.println("Contact Added!");
	}

	//show saved contacts
	@Override
	public void showContacts() {
		// TODO Auto-generated method stub
		Iterator<?> i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry m=(Map.Entry) i.next();
			System.out.println("Name "+(String)m.getKey()+"\tPhone " +(String)m.getValue());
		}
	}
}
