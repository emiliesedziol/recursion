
public class InfiniteRecursion {

	public static void main(String[] args) {
		int startnum = 3;  // must be a positive # > 1 or it will cause problems with the recursion
		System.out.println("statnum " + startnum + " sumRecursion is " + sumRecursion(0, startnum));

	}

	private static int sumRecursion(int callnum, int n) {
		int newnum;
		int total;

		callnum++;
		System.out.println("Enter sumRecursion - callnum " + callnum + " n " + n);
		if (n==1) {  // if this was missing the recursion would run infinite, bad
			total = 1;
			System.out.println("--- end of condition total " + total);
		}
		else {
			newnum = n - 1;
			System.out.println("before callnum " + callnum + " newnum " + newnum);
			total = n + sumRecursion(callnum, newnum);
			System.out.println("  after n " + n + " total " + total);
		}
		System.out.println("Return n " + n + " total " + total);
		return total;
	}
}
