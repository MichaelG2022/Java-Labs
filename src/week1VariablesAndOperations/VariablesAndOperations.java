package week1VariablesAndOperations;

public class VariablesAndOperations {

	public static void main(String[] args) {
		//quantity of available plane seats left on a flight
		int seatsAvailable = 6;
		
		//cost of groceries at checkout
		double groceryCost = 11.04;
		
		//person's middle initial
		char middleInitial = 'M';		//single quotes
		
		//true if hot outside, false if not
		boolean isHotOutside = false;
		
		//customer's first name
		String customerFirstName = "Harry";		//double quotes
		
		//street address
		String streetAddress = "4 Privet Drive" ;
		
		System.out.println("Seats remaining on the flight: " + seatsAvailable);
		System.out.println("$" + groceryCost + " is the total cost of groceries at checkout.");
		System.out.println("The person's middle initial is " + middleInitial+ ".");
		System.out.println("Is it hot outside? " + isHotOutside);
		System.out.println("The customer's first name is " + customerFirstName + ".");
		System.out.println("The delivery address for the groceries is " + streetAddress+ ".");
		
		
		//a customer booked 2 plane seats
		//seatsAvailable = seatsAvailable - 2;
		seatsAvailable -= 2;					//shorthand for subtraction 2
		System.out.println("Seats remaining on the flight: " + seatsAvailable);
		
		//bought a candy bar for 2.15
		//groceryCost = groceryCost + 2.15;		//shorthand for addition
		groceryCost += 2.15;
		//System.out.println(String.format("%.2f",groceryCost) + " is the new total cost of groceries at checkout.");		//String.format("%.2f",groceryCost)
		System.out.println("$" + groceryCost + " is the total cost of groceries at checkout.");
		
		//birth certificate printed incorrectly, change the middle initial
		middleInitial = 'J';
		System.out.println("The person's middle initial has been changed to " + middleInitial + ".");
		
		//season has changed, update hot outside variable
		//isHotOutside = true;
		isHotOutside = !isHotOutside;												// ! negates/changes the boolean value to the opposite of current value (= not)
		System.out.println("It is " + isHotOutside + " that it is hot outside.");
		
		//create new variable with customer's full name, make up a last name
		String customerFullName = customerFirstName + " " + middleInitial + ". " + "Potter";
		
		System.out.println("Meet " + customerFullName + "! He lives at " + streetAddress + " and just spent $" + groceryCost + " at the store.");
		//System.out.println(customerFirstName + " lives at " + streetAddress + " and just spent " + String.format("%.2f",groceryCost) + " at the store.");
		//System.out.println(customerFirstName + " lives at " + streetAddress + " and just spent " + groceryCost + " at the store.");


	}

}
