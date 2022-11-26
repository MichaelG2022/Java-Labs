package week2BooleanConditionalsLoop;

public class Part1W2 {

	public static void main(String[] args) {
		
		int age = 14;
		System.out.println(age >= 16);
		age = 16;
		System.out.println(age >= 16);
		
		age = 15;
		boolean hasLicense = true;
		
		if (age >=16 && hasLicense) {
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}
		
		double costOfMilk = 3.99;
		int thirstLevel = 7;
		
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk please");
		} else {
			System.out.println("No thanks");
		}
		
		// 0 cookies = Sad Face
		// less than 2 cookies = Yes!
		// less than 5 cookies = Whoohoooo!
		// 5 or more cookies = Jackpot!		
		int numberOfCookies = 17;
		int numberOfChildren = 10;
						
		// Going backwards
		if(numberOfCookies % numberOfChildren > 5) {
			System.out.println("Jackpot!");
		} else if (numberOfCookies % numberOfChildren >= 2) {
			System.out.println("Whoohooo!");
		} else if (numberOfCookies % numberOfChildren > 0) {
			System.out.println("Yes!");
		} else {
			System.out.println("Sad Face");
		}
		
		// Going forward
		if(numberOfCookies % numberOfChildren == 0) {
			System.out.println("Sad Face");			
		} else if (numberOfCookies % numberOfChildren < 2) {
			System.out.println("Yes!");			
		} else if (numberOfCookies % numberOfChildren < 5) {
			System.out.println("Whoohooo!");
		} else {
			System.out.println("Jackpot!");
		}
		
		// Most efficient way  - only have to do modulus calculation once
		int cookiesRemaining = numberOfCookies % numberOfChildren;
		if(cookiesRemaining == 0) {
			System.out.println("Sad Face");			
		} else if (cookiesRemaining < 2) {
			System.out.println("Yes!");			
		} else if (cookiesRemaining < 5) {
			System.out.println("Whoohooo!");
		} else {
			System.out.println("Jackpot!");
		}
		
		
		
		
		

	} // end of main

}
