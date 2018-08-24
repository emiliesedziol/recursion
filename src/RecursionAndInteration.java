
public class RecursionAndInteration {

	public static void main(String[] args) {

		int n = 17;
		System.out.println("Sum of " + n + " integers using recursion is " + sumRecursion(n));
		
		System.out.println("Sum of n " + n + " integers using FOR/NEXT is " + sumInteration(n));

	}

	private static int sumRecursion(int n) {
		int total;
		if (n == 1) {
			total = 1;
		}
		else {
			total = n + sumRecursion(n-1);
		}
		return total;
	}
	
	private static int sumInteration(int n) {
		int total = 0;
		
		for (int i=1; i<=n; i++) {
			total += i;
		}
		return total;
	}
}
