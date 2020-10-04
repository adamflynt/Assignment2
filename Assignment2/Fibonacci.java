/*
 * This program will list the Fibonacci sequence up to the
 * defined max term value of 10,000.
 */

public class Fibonacci {
	
	private static final int MAX_TERM_VALUE = 10000;
	
	public static void main (String[] args) {
		System.out.println("This program lists the Fibonacci sequence.");
		int fib1 = 0;
		int fib2 = 1;
		while (fib1 <= MAX_TERM_VALUE) {
			System.out.println(fib1);
			int fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
		}
	}

}
