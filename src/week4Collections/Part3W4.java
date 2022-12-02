package week4Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Part3W4 {

	public static void main(String[] args) {

		//Write and test a method that takes a set of integers and returns a new set of integers containing
			//only even numbers from the original set.
		Set<Integer> intSet = new HashSet<Integer>();
		// Use FOR loop to set some integer values in the Set
		for (int i = 0; i < 20; i++) {
			intSet.add(i);
		}
		Set<Integer> results = findEvenIntegers(intSet);
		for(int number : results) {
			System.out.println(number);
		}
		System.out.println("--------------");
		
		//Create a map of string and string and add 3 items to it where the key of each is a word and
			//the value is the definition of the word.
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("pusillanimous", "lacking courage and resolution; marked by contemptible timidity");
		dictionary.put("pulchritudinous", "having great physical beauty");
		dictionary.put("abstemiously", "in a sparing manner; without overindulgence");
		
		System.out.println(dictionary.keySet());
		System.out.println(dictionary.values());
		for(Entry<String, String> e: dictionary.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		} // end FOR
		
		System.out.println("--------------");
		
		
		//Write and test a method that takes a Map<String, String> and a string and returns the value for a key
			//in the map that matches the string parameter (i.e. like a language dictionary lookup)
		String value = findValue(dictionary, "youtube");
		System.out.println(value);
		// shortcut method
		System.out.println(findValue(dictionary, "abstemiously"));
		
		System.out.println("--------------");
		
		//Write and test a method that takes a List<String> and returns a Map<Character, Integer> containing a
			//count of all the strings that starts with a given character.
		List<String> strList = new ArrayList<String>();
		strList.add("January");
		strList.add("February");
		strList.add("March");
		strList.add("April");
		strList.add("May");
		strList.add("June");
		strList.add("July");
		strList.add("August");
		strList.add("September");
		strList.add("October");
		strList.add("November");
		strList.add("December");
		
		Map<Character, Integer> charCounts = countStartingLetters(strList);
		for (Character character : charCounts.keySet()) {
			System.out.println(character + " - " + charCounts.get(character));
		}

//******************************************		
		
	} // end MAIN
	
//******************************************
	
	
	//Write and test a method that takes a set of integers and returns a new set of integers containing
	//only even numbers from the original set.
	public static Set<Integer> findEvenIntegers(Set<Integer> set) {
		Set<Integer> resultSet = new HashSet<Integer>();
		for (int number : set) {
			if (number % 2 == 0) {
				resultSet.add(number);
			} // end IF
		} // end FOR
		return resultSet;
	} // end findEvenIntegers
	
	//Write and test a method that takes a Map<String, String> and a string and returns the value for a key
		//in the map that matches the string parameter (i.e. like a language dictionary lookup)
	public static String findValue(Map<String, String> inputMap, String keyChoice) {
		String result = "";
		for (String key : inputMap.keySet()) {
			if (key.equals(keyChoice));
			return inputMap.get(keyChoice);
		} // end FOR
		return "";
	} // end findValue
	
	//Write and test a method that takes a List<String> and returns a Map<Character, Integer> containing
		//a count of all the strings that starts with a given character.
	public static Map<Character, Integer> countStartingLetters (List<String> strList) {
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		for (String word : strList) {
			char c = word.charAt(0);						// Looks at first char of each String in strList
				if (charCount.get(c) ==  null) {			// If the first char of the String doesn't exist in the map key, add the first
					charCount.put(c, 1);						// char to the map with a value of 1 since it is the first entry for that letter
				} else {
					charCount.put(c, charCount.get(c) + 1);	// If the char does exist, add one to the value at the current key
				}
		} // end FOR
		return charCount;
	} // end findCharacterCount

} // end CLASS
