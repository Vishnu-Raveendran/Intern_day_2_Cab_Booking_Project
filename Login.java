package com.vishnu;

import java.util.Scanner;

public class Login {
	
	
	public static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName:"); 
		long UserName = sc.nextLong();                            // Prompt Username from User;
		String Final_UserName = String.valueOf(UserName); 
	    if(Final_UserName.length()==10) {                         //Moving Forward only when Username has 10 digits;
	    	System.out.print("Enter Password:");
	    	long pass = sc.nextLong();
	    	String Final_PassWord = String.valueOf(pass); 
	    	if(Final_PassWord.length()==8)                                    // Moving Forward only when password has 8 digits;
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
		
	}

}