package com.vishnu;

import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
	
	static void Billing(String cabname) {
		System.out.println("-----------------------------");
		System.out.println("Congratulations! You Have Chosen Ola "+cabname);
		System.out.println("------------------------------");
		
		
		LocalDate currentdate = LocalDate.now();
		System.out.println("JourneyDate: "+currentdate);
		
		LocalTime currenttime = LocalTime.now();
		System.out.println("PickUpTime: "+currenttime);
		
		System.out.println("-----------------------------");
		System.out.println("Thank You, Have a Nice Ride.");
		System.out.println("------------------------------");
		
		
		
	}

}
