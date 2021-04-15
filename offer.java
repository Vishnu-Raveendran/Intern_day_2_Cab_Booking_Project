package com.vishnu;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class offer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Date of Birth: ");
		String DOB = sc.next();
		LocalDate ParsedDob = LocalDate.parse(DOB); 
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		int Age = Period.between(ParsedDob, currentDate).getYears();
		
		if (Age >= 60){
						
		}
		System.out.println(Age);
		
		
	}
	
	
	

}
