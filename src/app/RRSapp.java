package app;

import java.util.Scanner;
import service.RRSservice;
import serviceimpln.RRSserviceImpln;

public class RRSapp {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		RRSservice rs=new RRSserviceImpln();
		System.out.println("...... WELCOME TO ROOM RENTAL SYSTEM ......");
		while(true) {
			System.out.println("-------- Menu --------");
			System.out.println(" 1.Room info \n 2.Room Availability \n 3.Check info \n 4.Check out \n 5.Exit");
			System.out.println("Enter your option : ");
			int op=ip.nextInt();
			switch(op) {
				case 1:rs.roomInfo();
				break;
				case 2:rs.checkAvailability();
				break;
				case 3:rs.checkIn();			
				break;
				case 4:rs.checkOut();
				break;
				case 5:System.out.println("Thank you ... Visit Again");
					   System.exit(0);
				break;
				default:System.err.println("Invalid option");
			}
		}
	}

}
