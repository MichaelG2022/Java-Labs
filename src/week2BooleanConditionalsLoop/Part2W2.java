package week2BooleanConditionalsLoop;

import java.util.Scanner;

public class Part2W2 {

	public static void main(String[] args) {
		String loyaltyMemberStatus = "PLATINUM";
		double loyaltyMemberDiscount = 0.0;
		
		switch (loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount = 0.10;
				break;
			case "GOLD":
				loyaltyMemberDiscount = 0.15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = 0.25;
				break;
			default:
				loyaltyMemberDiscount = 0.00;
				break;		
		} // end of switch
		
		// System.out.println("Member status is " + loyaltyMemberStatus);
		// System.out.println("Member discount is " + loyaltyMemberDiscount);
		
		double billTotal = 956.78;
		double adjustedTotal = billTotal - (billTotal * loyaltyMemberDiscount);
		boolean statusUpgrade = false;
		
		// System.out.println(adjustedTotal);
		
		if (adjustedTotal > 500) {
			if (loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD";
				statusUpgrade = true;
			} else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
				statusUpgrade = true;
			} else {
				statusUpgrade = false;
			}
		}// end IF
		
		if (adjustedTotal > 500) {
			if (loyaltyMemberStatus.equals("SILVER")) {
				loyaltyMemberStatus = "GOLD";
				statusUpgrade = true;
			} else if (loyaltyMemberStatus.equals("GOLD")) {
				loyaltyMemberStatus = "PLATINUM";
				statusUpgrade = true;
			} else {
				statusUpgrade = false;
			}
		}// end IF
				
		if (statusUpgrade == true) {
			System.out.println("Congratulations! Your membership has been upgraded to " + loyaltyMemberStatus);
		} else if (statusUpgrade == false && loyaltyMemberStatus == "PLATINUM") {
			System.out.println("Congratulations on maintaining your " + loyaltyMemberStatus + " membership status!");
		} else {
			System.out.println("Sorry, you did not qualify for a membership upgrade this time.");
		} // end IF	
		
		
		
		String username = "Sammy123";
		String password = "12345";
		
		Scanner sc= new Scanner(System.in);
		// System.in is a standard input stream
		
		System.out.print("Enter username: ");
			username = sc.nextLine();
		System.out.print("Enter password: ");
			password = sc.nextLine();
			
		if (username.equals("Tommy123") && password.equals("12345")) {
		// NOTE TO SELF - have to use .equals to test Strings, not ==
			System.out.println("Login successful!");
		} else {
			System.out.println("Access denied");
		} // end IF-ELSE
	} // end MAIN

} // end CLASS
