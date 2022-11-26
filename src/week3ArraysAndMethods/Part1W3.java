package week3ArraysAndMethods;

public class Part1W3 {

	public static void main(String[] args) {
		
//create an array with the following values 1, 5, 2, 8, 13, 6
		// The long method is shown. The short method is preferred.
//			int[] array = new int[6];
//			array[0] = 1;
//			array[1] = 5;
//			array[2] = 2;
//			array[3] = 8;
//			array[4] = 13;
//			array[5] = 6;
			int[] array = {1,5,2,8,13,6};			// preferred method 
			
			
//print out the first element in the array
			System.out.println(array[0]);
		
//print out the last element in the array without using the number 5
			System.out.println(array[array.length - 1]);		// my rough solution matched the video
		
//print out the element in the array at position 6. what happens?
			//System.out.println(array[6]);
			// The program throws an ArrayIndexOutOfBoundsException because there is no position 6 in this array
		
//print out the element in the array at position -1. what happens?
			//System.out.println(array[-1]);
			// The program throws an ArrayIndexOutOfBoundsException because there is no position -1 in this array
		
//write a traditional for loop that prints out each element in the array
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			} // end FOR
		
//write an enhanced for loop that prints out each element in the array
			for (int number : array) {
				System.out.println(number);
			} // end FOR
		
//create a new variable called sum, write a loop that adds each element in the array to the sum
			double sum = 0;					// changed from int to double to make the average in the next step work
			for (int number : array) {
				sum+= number;
			} // end FOR
			System.out.println(sum);
		
//create a new variable called average and assign the average value of the array to it
			double average = sum / array.length; 
			System.out.println(average);			 
		
//write an enhanced for loop that prints out each number in the array only if the number is odd
			for (int number : array) {
				if (number % 2 == 1) {				// if (number % 2 == 1) is also valid, as is  > 0 
					System.out.println(number);
				} // end IF
			} // end FOR
		
//create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
			String[] names = {"Sam","Sally","Thomas","Robert"};
		
//calculate the sum of all the letters in the new array
			int sumOfLetters = 0;
			for (String name : names) {
				sumOfLetters += name.length();
			} // end FOR
			System.out.println(sumOfLetters);
		

		
	} // end MAIN
	
	
	

} // end CLASS Part1W3
