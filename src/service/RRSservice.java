package service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import entity.Customer;

public interface RRSservice {
	
	LinkedHashMap<Integer, Customer> ac=new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer> nonAc=new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer> deluxe=new LinkedHashMap<Integer, Customer>();
	ArrayList<Customer> L1=new ArrayList<Customer>();
	
	void roomInfo();
	void checkAvailability();
	void checkIn();
	void allocate(LinkedHashMap<Integer, Customer> m,double camr,String roomtype,int roomno);
	void checkOut();
}
