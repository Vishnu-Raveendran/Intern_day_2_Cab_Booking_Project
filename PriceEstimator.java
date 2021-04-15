package com.vishnu;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class PriceEstimator {

	////////////////////////////////////////////////
	static double GST(int km) {
		double RsWithGst = km + ((km * 7) / 100.0);
		return RsWithGst;
	}

	static Scanner sc = new Scanner(System.in);

	/////////////////////////////////////////////////

	static void MicroFare() {
		System.out.println("-----------------------------");
		System.out.print("Enter distance to destination: ");
		int TotalKilometers = sc.nextInt();

		int RsWithoutGst = TotalKilometers * 10;
		//System.out.println("Total Fare + GST: " + GST(RsWithoutGst) + " Rs");

		// --->

		System.out.println("                          ");
		System.out.println("Enter Your Date of Birth: ");
		String DOB = sc.next();

		LocalDate ParsedDob = LocalDate.parse(DOB);
		LocalDate currentDate = LocalDate.now();

		int Age = Period.between(ParsedDob, currentDate).getYears();

		LocalTime currenttime = LocalTime.now();
		int Hikehour = currenttime.getHour();
		
		if (Age >= 60 && (Hikehour <17 || Hikehour>19 ) ) {
			
			System.out.println("-----------------------------------------");
			System.out.println("Hurray! You are eligible for 50% discount!");
			System.out.println("-----------------------------------------");
			
			System.out.println(GST(RsWithoutGst) - GST(RsWithoutGst) * 50 / 100 + " Rs ---> Total Fare");

		}
		// ---->

		if (Hikehour >= 17 && Hikehour <= 19) {
			System.out.println(GST(RsWithoutGst) + GST(RsWithoutGst) * 1.25 / 100 + " Rs ---> Total Fare");
		}

	}

	///////////////////////////////////////////////////
	static void MiniFare() {
		System.out.print("Enter distance to destination: ");
		int TotalKilometers = sc.nextInt();
		int RsWithoutGst = TotalKilometers * 15;
		//System.out.println("Total Fare + GST: " + GST(RsWithoutGst) + " Rs");

		// ---->

		System.out.println("                          ");
		System.out.println("Enter Your Date of Birth: ");
		String DOB = sc.next();

		LocalDate ParsedDob = LocalDate.parse(DOB);
		LocalDate currentDate = LocalDate.now();

		int Age = Period.between(ParsedDob, currentDate).getYears();
		
		LocalTime currenttime = LocalTime.now();
		int Hikehour = currenttime.getHour();

		if (Age >= 60 && (Hikehour<17 || Hikehour>19)) {
			

			System.out.println("-----------------------------------------");
			System.out.println("Hurray! You are eligible for 50% discount!");
			System.out.println("-----------------------------------------");
			System.out.println(GST(RsWithoutGst) - GST(RsWithoutGst) * 50 / 100 + " Rs ---> Total Fare");

		}

		// ---->
		if (Hikehour >= 17 && Hikehour <= 19) {
			System.out.println(GST(RsWithoutGst) + GST(RsWithoutGst) * 1.25 / 100 + " Rs ---> Total Fare");
		}

	}

	/////////////////////////////////////////////////////
	static void PrimeFare() {
		System.out.print("Enter distance to destination: ");
		int TotalKilometers = sc.nextInt();

		int RsWithoutGst = TotalKilometers * 20;
		//System.out.println("Total Fare + GST: " + GST(RsWithoutGst) + " Rs");

		// ----->

		System.out.println("                          ");
		System.out.println("Enter Your Date of Birth: ");
		String DOB = sc.next();

		LocalDate ParsedDob = LocalDate.parse(DOB);
		LocalDate currentDate = LocalDate.now();

		int Age = Period.between(ParsedDob, currentDate).getYears();
		LocalTime currenttime = LocalTime.now();
		int Hikehour = currenttime.getHour();

		if (Age >= 60 && (Hikehour<17 || Hikehour>19)) {
			

			System.out.println("-----------------------------------------");
			System.out.println("Hurray! You are eligible for 50% discount!");
			System.out.println("-----------------------------------------");

			System.out.println(GST(RsWithoutGst) - GST(RsWithoutGst) * 50 / 100 + " Rs ---> Total Fare");

		}

		if (Hikehour >= 17 && Hikehour <= 19) {
			System.out.println(GST(RsWithoutGst) + GST(RsWithoutGst) * 1.25 / 100 + " Rs ---> Total Fare");
		}

	}

}
