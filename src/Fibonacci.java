
public class Fibonacci {

	public static long number_of_calls = 0;
	
	public static void main(String[] args) {
		/*
		 * series of numbers where a number is found by adding up the two numbers before it. 
		 * Starting with 0 and 1, the sequence goes 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
		 */

		long r;
		
		for (int i = 0; i < 10; i++ ) {
			// 10 iterations works
			// 100 iterations really slows down the system
			// eventually you could take a system down if the # is large enough
			number_of_calls = 0;
			System.out.println(" before recursion number_of_calls " + number_of_calls);
		//	System.out.println("i " + i + " fibonacciRecursion(i) " + fibonacciRecursion(i) + " number_of_calls " + number_of_calls );
			System.out.println("i " + i + " number_of_calls " + number_of_calls + " fibonacciRecursion(i) " + fibonacciRecursion(i));
			System.out.println(" after recursion number_of_calls " + number_of_calls);
		//	r = fibonacciRecursion(i);
		//	System.out.println("i " + i + " r " + r + " number_of_calls " + number_of_calls );
		}
		System.out.println("");
		int s;
		for (int j = 0; j < 10; j++) {
			number_of_calls = 0;
			s = fibonacciIteration(j);
			System.out.println("j " + j + " s " + s);
		}
		s = fibonacciIteration(45);
		System.out.println("\n\n Fibonacci 45 " + s);
	}

		private static int fibonacciRecursion(int n) {
			int s;
			
			number_of_calls += 1;
			switch (n) {
			case 0:
				s = 0;
				break;
			case 1:
				s = 1;
				break;
			default:
				s = fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
			}
			return s;
		}
		
		private static int fibonacciIteration(int n) {
			int r = 1;
			int y = 0;
			
			switch (n) {
			case 0:
				r = 0;
				break;
			case 1:
				r = 1;
				break;
			default:
				for (int i = 1; i < n; i++) {
					r += y;
					y = r - y;
				}
			}
			
			return r;
		}
}
/*

i 0 r 0 number_of_calls 1
i 1 r 1 number_of_calls 1
i 2 r 1 number_of_calls 3
i 3 r 2 number_of_calls 5
i 4 r 3 number_of_calls 9
i 5 r 5 number_of_calls 15
i 6 r 8 number_of_calls 25
i 7 r 13 number_of_calls 41
i 8 r 21 number_of_calls 67
i 9 r 34 number_of_calls 109

j 0 s 0
j 1 s 1
j 2 s 1
j 3 s 2
j 4 s 3
j 5 s 5
j 6 s 8
j 7 s 13
j 8 s 21
j 9 s 34


 Fibonacci 45 1134903170


now let's look at something where recursion isn't really that good - you'll often see Fibonacci 
  numbers evaluated recursively in examples of recursion but here the number of calls grows 
  exponentially - which makes the method totally unusable for large Fibonacci numbers 
   (or even quite modest Fibonacci numbers) if you try calculating the 50th Fibonacci number 
   using this method, you'll be waiting some time
   
   long / short recursion shouldn't be used with large recursions
   or it could take a long time
*/