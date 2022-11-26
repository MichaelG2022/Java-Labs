package week3ArraysAndMethods;

public class Part2W3 {

	public static void main(String[] args) {

//write and test a method that takes a String name and prints out a greeting,  This method returns nothing
		printGreeting("Bob");
		printGreeting("Sally");
		
//write and test a method that takes a String name and returns a greeting, do not print in the method
		System.out.println(createGreeting("John"));
		System.out.println(createGreeting("Vicky"));
		
		String greeting = createGreeting("Matt");		// This allows the greeting to be used elsewhere
		System.out.println(greeting);		
		
//analyze the difference between these two methods - what do you find? How are they different?
		//The first one doesn't allow the greeting to be used anywhere else
		//The second allows the greeting to be captured and reused.		
		
//write and test a method that takes a String and an int and returns true if the number of letters in the string is great than the int
		System.out.println(isStringLongerThanNumber("Jennifer",7));
				
//write and test a method that takes an array of string and a string and returns true if the string passed in exists in the array
		String[] array = {"Jack","Mickey","Jeanie","Sue","John","Stephen"};
		String name = "Bob";
		System.out.println(doesArrayContainString(array,name));
		

		
		
		
		
	} // end MAIN
	
	public static void printGreeting(String name) {
		System.out.println("Hello, " + name + "!");
	} // end printGreeting
	
	public static String createGreeting(String name) {
		return "Howdy, " + name + "!";
	} // end createGreeting
	
	public static boolean isStringLongerThanNumber(String string, int number) {
		return (string.length() > number);
	} // end isStringLongerThanNumber
	
	public static boolean doesArrayContainString(String[] array, String string) {
		for (String str : array) {
			if (str.equals(string)) {
				return true;
			} // end IF						
		} // end FOR
		return false;
	} // end doesArrayContainString
	
	

} //end CLASS Part2W3
