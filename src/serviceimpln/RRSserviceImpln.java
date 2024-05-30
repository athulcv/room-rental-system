package serviceimpln;

import java.util.LinkedHashMap;
import java.util.Scanner;
import entity.Address;
import entity.Customer;
import service.RRSservice;

public class RRSserviceImpln implements RRSservice{
	Scanner ip=new Scanner(System.in);
	{
		for(int i=101;i<=108;i++) {
			ac.put(i, null);
		}
	}
	
	@Override
	public void roomInfo() {
		System.out.println("------- Room Details -------");
		System.out.println("~~~~~~~ AC Rooms ~~~~~~~");
		System.out.println("1.AC \n 2.TV \n 3.WiFi \n 4.Fridge");
		System.out.println("Price : 2000 per day");
	}

	@Override
	public void checkAvailability() {
		System.out.println("======= AC Rooms =======");
		int c=0;
		for(int key:ac.keySet()) {   //[101,102,103,...........,108]
			if(ac.get(key)==null) {
				System.out.println(key+" ");
				c++;
			}
		}
		if(c==0) {
			System.out.println("All Rooms are occupied..!!");
		}
		System.out.println();
	}
	
	@Override
	public void checkIn() {
		  System.out.println("-------Check In--------");
		  System.out.println("~~~~~Room Details~~~~~");
		  System.out.println(" 1.AC \n 2.Non-AC \n 3.Deluxe");
		  System.out.println("Enter your option : ");
		  int op=ip.nextInt();
		  System.out.println("Enter your room number :");
		  int roomno=ip.nextInt();
		  switch(op) 
		  {
		  	case 1: if(ac.containsKey(roomno) && ac.get(roomno)==null) 
		  			{
		  				allocate(ac, 2500, "AC", roomno);
		  			}
		  			else 
		  			{
		  				System.err.println("Invalid Room number or Room is not available");
		  			}
		  	break;
		  	case 2: System.out.println("system maintainence underway...");
		  	break;
		  	case 3: System.out.println("system maintainence underway...");
		  	break;
		  	default: System.out.println("Invalid option..!");
		  }
		  
	}

	@Override
	public void allocate(LinkedHashMap<Integer, Customer> m, double camt, String roomtype, int roomno) {
		System.out.println("====== Customer Details ======");
		System.out.println("Please enter Customer id :");
		int cid=ip.nextInt();
		System.out.println("Please enter Customer name :");
		String cname=ip.next();
		System.out.println("enter Customer Phone number :");
		long phno=ip.nextLong();
		System.out.println("enter the House number :");
		String houseno=ip.next();
		System.out.println("enter the Street name :");
		String streetname=ip.next();
		System.out.println("enter location Pincode :");
		int pin=ip.nextInt();
		Address a=new Address(houseno,streetname,pin);
		Customer c=new Customer(cid, cname, phno, a, camt, roomtype);
		L1.add(c);
		m.put(roomno,c);
		System.out.println(c.getCphno()+" had allocated for "+roomtype+" Room number:"+roomno);
	}

	@Override
	public void checkOut() {
		System.out.println("-------Check Out--------");
		System.out.println("~~~~~Room Details~~~~~");
		System.out.println(" 1.AC \n 2.Non-AC \n 3.Deluxe");
		System.out.println("Enter your option : ");
		int op=ip.nextInt();
		System.out.println("Please enter your room number :");
		int roomno=ip.nextInt();
		System.out.println("Please enter Customer id :");
		int cid=ip.nextInt();
		switch(op) {
		case 1:if(ac.containsKey(roomno) && ac.get(roomno)==null && ac.get(roomno).getCid()==cid)
			   {
					System.out.println(ac.get(roomno).getCname()+" Thanks for visiting... :)");
					ac.put(roomno, null);
			   }
			   else 
			   {
				   System.out.println("Invalid credentials..!!");
		       }
		break;
		case 2: System.out.println("system maintainence underway...");
	  	break;
	  	case 3: System.out.println("system maintainence underway...");
	  	break;
	  	default: System.out.println("Invalid option..!");
		
		}
		
	}

	
}
