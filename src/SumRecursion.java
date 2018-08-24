
public class SumRecursion {
	public static int total = 0;

	public static void main(String[] args) {
	
		System.out.println("At Start: total " + total);
		sumRecursion(0);
		System.out.println("At End:  total " + total);

	}

	private static void sumRecursion(int n) {
		n += 1;
		total += 1;
		System.out.println("n " + n + " total " + total);
		if (total < 3) {
			sumRecursion(n);
		}
		System.out.println("end n " + n  + " total " + total);
		
	}

}

/*
 *
At Start: total 0
n 1 total 1			memory block 1
n 2 total 2			memory block 2
n 3 total 3			memory block 3
end n 3 total 3		release memory block 3
end n 2 total 3		release memory block 2
end n 1 total 3		release memory block 1
At End:  total 3

total is initialized outside the function
'n' is initialized in the function
*/