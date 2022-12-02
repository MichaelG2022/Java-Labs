package week4Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Part2W4 {

	public static void main(String[] args) {
		
		
		//Write and test a method that takes a list of Strings and a string and returns a new list with all strings from the original list
			//containing the second string parameter (i.e. like a search method).
		
		List<String> stringList = new ArrayList<>();
		stringList.add("January");
		stringList.add("February");
		stringList.add("March");
		stringList.add("May");
		stringList.add("June");
				
		System.out.println(findString(stringList, "n"));		// prints out with []
		for (String result : findString(stringList, "n"))
			System.out.print(result + ", ");
		System.out.println();
		//Instructor result
		List<String> searchResults = findString(stringList, "a");
		for (String results : searchResults) {
			System.out.println(results); 
			
		}
		
		//Write and test a method that takes a list of integers and returns a List<List<Integer>> where the first list
			//in the returned value contains any number from the input list that is divisible by 2, the second list contains values
			//from the input list that are divisible by 3, the third divisible by 5, and the fourth all numbers from the
			//input list not divisible by 2, 3, or 5.
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,30);
		
		List<List<Integer>> results = findDivisiveIntegers(intList);
		System.out.println(results);							// prints out with []
		// Prints results without a comma at the end
		for (List<Integer> i : results) {			
			for (int j : i) {
				if (i.indexOf(j) < i.size() - 1) {
					System.out.print(j + ", ");	
				} else {
				System.out.print(j + " ");
				} // end IF-ELSE
			} // end inner FOR
			System.out.println();
		} // end outer FOR
		
		// Instructor solution differences + my slight modifications
		//List<List<Integer>> results = findDivisiveIntegers(intList);
		for (List<Integer> list : results) {
			for (Integer number : list) {
				System.out.print(number + ", ");
			} // end inner FOR
			System.out.println(" --- end of list ---");
			
		} // end outer FOR
		
		
		//Write and test a method that takes a list of strings and returns a list of integers that contains the length of each string.
		System.out.println(findStringLength(stringList));			// prints out with []
		for (int i : findStringLength(stringList)) {
			System.out.print(i + ", ");
		}
		System.out.println();										// carriage return for next console output
		
		// Instructor solution similar to mine except he assigns the call to a variable and uses that in the loop
		
		//Create a set of strings and add 5 values.
		Set<String> strSet = new HashSet<String>();
		strSet.add("January");
		strSet.add("February");
		strSet.add("March");
		strSet.add("May");
		strSet.add("June");
		
		//Write and test a method that takes a set of strings and a character and returns a set of strings consisting of
			//all the strings in the input set that start with the character parameter.
		System.out.println(findStringThatStartsWith(strSet, 'M'));			// prints out with []
		for (String i : findStringThatStartsWith(strSet, 'M')) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//Write and test a method that takes a set of strings and returns a list of the same strings.
		System.out.println(convertSetToList(strSet));					// prints out with []
		for (String i : convertSetToList(strSet)) {
			System.out.print(i + " ");
		}
		System.out.println(); 											// carriage return
		
		// Instructor solution slightly different
		List<String> resultList = convertSetToList(strSet);
		for (String i : resultList) {
			System.out.println(i + " ");
		}
		
//***************************************

	} // end MAIN
	
//***************************************	
	
	//Write and test a method that takes a list of Strings and a string and returns a new list with all strings from the original list
		//containing the second string parameter (i.e. like a search method).
	public static List<String> findString(List<String> firstList, String searchItem) {
		List<String> secondList = new ArrayList<String>();
		for(String word : firstList) {
			if (word.contains(searchItem)) {
				secondList.add(word);
			} // end IF
		} // end FOR
		return secondList;
	} // end findSearchString
	
	//Write and test a method that takes a list of integers and returns a List<List<Integer>> where the first list
		//in the returned value contains any number from the input list that is divisible by 2,
		//the second list contains values /from the input list that are divisible by 3, the third divisible by 5,
		//and the fourth all numbers from the input list not divisible by 2, 3, or 5.
	public static List<List<Integer>> findDivisiveIntegers(List<Integer> list) {
		// Instructor solution
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		
		for (Integer number : list) {
			if( number % 2 == 0) {
				results.get(0).add(number);					//index of 0 refers to the first new list made in this method
			}
			if( number % 3 == 0) {
				results.get(1).add(number);					//index of 1 refers to the second new list made in this method
			}
			if( number % 5 == 0) {
				results.get(2).add(number);					//index of 2 refers to the third new list made in this method
			}
			if( number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
				results.get(3).add(number);					//index of 3 refers to the fourth new list made in this method
			}
			
		}
		return results;
				
		// My solution - not far off
//		List<List<Integer>> listOfLists = new ArrayList<Integer>();
//		List<Integer> evenNumbers = new ArrayList<Integer>();
//		List<Integer> multipleOfThree = new ArrayList<Integer>();
//		List<Integer> multipleOfFive = new ArrayList<Integer>();
//		List<Integer> noMultiple = new ArrayList<Integer>();
//		for (Integer number : list) {
//			if (number % 2 == 0) {
//				evenNumbers.add(number);				
//			}
//			if (number % 3 == 0) {
//					multipleOfThree.add(number);
//			}
//			if (number % 5 == 0) {
//						multipleOfFive.add(number);
//			}
//			if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
//				noMultiple.add(number);
//			}
//			
//		} // end FOR
//		multipleOfFive.addAll(noMultiple);
//		multipleOfThree.addAll(multipleOfFive);
//		evenNumbers.addAll(multipleOfThree);
//		listOfLists.add(evenNumbers);
//		return listOfLists;
	} // end findDivisiveIntegers
	
	//Write and test a method that takes a list of strings and returns a list of integers that contains the length of each string.
	public static List<Integer> findStringLength(List<String> stringList) {
		List<Integer> lengths = new ArrayList<>();
		for (String word : stringList) {
			lengths.add(word.length());
		} // end FOR
		return lengths;
	} // end findStringLength
			
	//Write and test a method that takes a set of strings and a character and returns a set of strings consisting of
		//all the strings in the input set that start with the character parameter.
	
	// I initially had the search character as a String and used word.startsWith(searchString).
		// Instructor used char so I changed to match and used word.charAt(0) instead
	public static Set<String> findStringThatStartsWith(Set<String> strList, char searchChar) {
		Set<String> results = new HashSet<String>();
		for (String word : strList) {
			if (word.charAt(0) == searchChar) {
				results.add(word);
			} // end IF					
		} // end FOR
		return results;
	} // end stringStartsWith
			
	//Write and test a method that takes a set of strings and returns a list of the same strings.
	public static List<String> convertSetToList(Set<String> strSet) {
		List<String> strList = new ArrayList<String>();
		for (String word : strSet) {
			strList.add(word);
		} // end FOR
		return strList;
	} // end convertToList
} // end CLASS
