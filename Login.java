package com.vishnu;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter UserName:"); 
		long UserName = sc.nextLong();                            // Prompt Username from User;
		String Final_UserName = String.valueOf(UserName); 
	    if(Final_UserName.length()==10) {                         //Moving Forward only when Username has 10 digits;
	    	System.out.print("Enter Password:");
	    	String pass = sc.next();							   //prompt Passwrd from User
	    	if(pass.length()==8)                                    // Moving Forward only when password has 8 digits;
	    	{
	    		
	    		System.out.println("-----------------");            
	    		System.out.println("LOGIN SUCCESSFULL");
	    		System.out.println("-----------------");
	    		CabType.TypeofCab();
	    	}
	    	else {
	    		System.out.println("-----------------");
	    		System.out.println("LOGIN FAILED");
	    		System.out.println("-----------------");
	    	}
	    }
	    else {
	    	System.out.println("Username should be 10 characters.");
	    }
		sc.close();
		
		
		

	}

}
