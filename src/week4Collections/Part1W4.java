package week4Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Part1W4 {

	public static void main(String[] args) {

	//Why would we use a StringBuilder instead of a String?
		// String is immutable - the original object remains in memory.
		// StringBuilder is mutable. It allows changes without taking additional memory locations.
		
	//Instantiate a new StringBuilder and append the characters 0 through 9 to it separated by dashes.
		// Make sure no dash appears at the end of the StringBuilder.
		
		StringBuilder numbers = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			if (i < 9) {
				numbers.append(i + "-");
			} else {
				numbers.append(i);
			} // end IF-ELSE			
		} // end FOR
		System.out.println(numbers.toString());
		
		// Resetting StringBuilder numbers to show instructor solution
		numbers = numbers.delete(0, numbers.length());				// .delete has length -1 built in
		
		//Instructor solution
		for (int i = 0; i < 10; i++) {
			numbers.append(i);
			if (i != 9) {
				numbers.append("-");
			} // end IF			
		} // end FOR
		System.out.println(numbers.toString());		
			
	//Create a list of Strings and add 5 Strings to it, each with a different length.
		
		List<String> stringList = new ArrayList<>();
		stringList.add("January");
		stringList.add("February");
		stringList.add("March");
		stringList.add("May");
		stringList.add("June");
		for (String month : stringList) {
			System.out.println(month);
		} // end FOR
		
		//Instructor shown shortcut method
		List<String> stringList2 = Arrays.asList("January","February","March","May","June");
		for (String month : stringList2) {
			System.out.println(month);
		} // end FOR
		
	//Write and test a method that takes a list of Strings and returns the shortest String.
		
		System.out.println("Shortest string is: " + findShortestString(stringList));
		
	//Write and test a method that takes a list of Strings and returns the list with the first and last elements switched.
		System.out.print("Original list is: ");
		for (String month : stringList) {
			System.out.print(month);
		} // end FOR
		List<String> newStringList = swapFirstAndLast(stringList);
		System.out.print("\nNew list is: ");
		for (String month : newStringList) {
			System.out.print(month);
		} // end FOR		
		
	//Write and test a method that takes a list of Strings and returns a String with all the list elements
		//concatenated to each other, separated by a comma.
		System.out.println();
		System.out.println("Concatenated list is: " + concatList(stringList));
		
		
	} // end MAIN
	
	//Write and test a method that takes a list of Strings and returns the shortest String.
	public static String findShortestString(List<String> strList) {
		String shortestString = strList.get(0);
		
		for (String string : strList) {
			if (string.length() < shortestString.length()) {
				shortestString = string;				
			} // end IF			
		} // end FOR
		return shortestString;
	} // end findShortestString
	
	//Write and test a method that takes a list of Strings and returns the list with the first and last elements switched.
	public static List<String> swapFirstAndLast(List<String> strList) {
		String first = strList.get(0);
		//Instructor alternative to using my variable last
		//strList.set(0, strList.get(strList.size() - 1));
		String last = strList.get(strList.size() - 1);
		strList.set(0, last);
		strList.set((strList.size() - 1),first);
		return strList;
	} // end swapFirstAndLast
	
	//Write and test a method that takes a list of Strings and returns a String with all the list elements
			//concatenated to each other, separated by a comma.
	public static String concatList(List<String> strList) {
		//Instructor more proper method - does not remove comma after last element
		StringBuilder newString = new StringBuilder();
		for (String string : strList) {
			newString.append(string + ", ");
		} // end FOR
		return newString.toString();
		
		// My solution - removes comma after last element
		//String newString = "";
//		for (int i = 0; i < (strList.size()); i++) {
//			if (i < (strList.size() - 1)) {
//				newString += strList.get(i) + ",";
//			} else {
//				newString += strList.get(i);
//			} // end IF-ELSE			 
//		} // end FOR
//		return newString;
	} // end concatList	

} // end CLASS
