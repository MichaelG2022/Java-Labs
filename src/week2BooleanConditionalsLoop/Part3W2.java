package week2BooleanConditionalsLoop;

public class Part3W2 {

	public static void main(String[] args) {

		// for loop - prints every number from 0 to 9
//		for (int i = 0;  i < 10; i++) {
//			System.out.println(i);
//		} // end FOR

		// for loop - prints every number from 10 to 0 backwards
//		for (int i = 10; i >= 0; i--) {
//			System.out.println(i);
//		} // end FOR

		// for loop - prints every other number from 0 to 100
//		for (int i = 0; i <= 100; i+= 2) {
//			System.out.println(i);
//		} // end FOR
//		COULD ALSO DO i++, THEN do sysout only if (i %2 == 0) -- less efficient than i += 2		

		// for loop - iterates from 0 to 100, prints "EVEN" if even and "ODD" if odd
//		for (int i = 0; i <= 100; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i + " EVEN");
//			} else {
//				System.out.println(i + " ODD");
//			} // end IF
//		} // end FOR

		// while loop - iterates from 100 to 0 backwards, divides each number by 3, prints remainder to console
		int i = 100;
		
		while (i >= 0) {
			System.out.println( i + " " + (i % 3));
			i--;
		} // end WHILE
		
	} // end MAIN
} // end CLASS
