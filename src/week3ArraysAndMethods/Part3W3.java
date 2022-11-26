package week3ArraysAndMethods;

public class Part3W3 {
	
	public static void main(String[] args) {

//write and test a method that takes an array of int and returns the smallest number in the array
		int[] array = {12,34,4,14,-1};
		System.out.println(getSmallestNumber(array));
		
//write and test a method that takes an array of double and returns the average
		double[] dArray = {12.6,28.01,63.2};
		System.out.println(getAverage(dArray));
				
//write and test a method that takes an array of Strings and returns an array of int where each element
		// matches the length of the string at that position
		String[] sArray = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int counter = 1;				// added to prevent a comma after the last member of the string
		for (int length : extractStringLengths(sArray)) {
			if(counter < sArray.length) {
				System.out.print(sArray[counter - 1] + "=" + length + ", ");
			} else {
				System.out.println(sArray[counter - 1] + "=" + length);
			} // end IF-ELSE
			counter ++;
		} // end FOR
		
//write and test a method that takes an array of strings and returns true if the sum of letters for all strings with an
		// even amount of letters is greater than the sum of those with an odd amount of letters
		System.out.println("There more letters in the even-lettered words: " + countOddAndEven(sArray));		
		
//write and test a method that takes a string and returns true if the string is a palindrome
		System.out.println("The string is a palindrome: " + isPalindrome2("trouble"));		
		
	} // end MAIN
	
	public static int getSmallestNumber(int[] array) {
		//int smallest = Integer.MAX_VALUE;				// my method
		int smallest = array[0];						// instructor method, makes more sense
		for (int number : array) {
			if (number < smallest) {
				smallest = number;
			} // end IF
		} // end FOR
		return smallest;
	} // end smallestNumber
	
	public static double getAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
		sum += number;	
		} // end FOR
		return (sum / array.length);
	} // end getAverage
	
	
	public static int[] extractStringLengths(String[] array) {
		int[] stringLength = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			stringLength[i] = array[i].length();
		} // end FOR
	return stringLength;
	} // end countLetters
	
	public static boolean countOddAndEven(String[] array) {
		int even = 0;
		int odd = 0;
		for (String string : array) {
			if (string.length() % 2 == 0) {
				even += string.length();				
			} else {
				odd += string.length();
			} // end IF-ELSE
		} // end FOR
/*/		if (even > odd) {					// These lines are my return solution
			return true;
		} else {
			return false;
		} // end IF-ELSE		*/
		return even > odd;					// Instructor solution			
	} // end countOddAndEven
	
// My palindrome solution	
	public static boolean isPalindrome(String str) {
		String reverse = "";
		for (int i = (str.length() - 1); i >= 0; i--) {
			reverse += str.charAt(i);
		} // end FOR
		return (str.equalsIgnoreCase(reverse));
	} // end isPalindrome
	
// Instructor palindrome solution
	public static boolean isPalindrome2(String string) {
		for (int i = 0; i < string.length() / 2; i++) {							// Only have to go halfway through the string because of palindrome definition.
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {	// This compares first letter vs last letter first, then moves
				return false;														// to the next letter, etc. Only have to do half the length
			} // end if																// by then, everything has matched so far.
		} // end FOR																// i has to be subtracted from the right side of the comparison
		return true;																// to move in from the end letter. 
	} // end isPalindrome2
	
	
	

} // end CLASS Part3W3
