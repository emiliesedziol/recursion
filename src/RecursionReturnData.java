
public class RecursionReturnData {

	public static void main(String[] args) {
			
			int startnum = 3;
			int total = sumRecursion(0, startnum);
			System.out.println("at the end startnum " + startnum + " total " + total);

		}
		
		private static int sumRecursion(int callnum, int n) {
			int newnum;
			int total;

			callnum++;
			System.out.println("Enter sumRecursion - callnum " + callnum + " n " + n);
			if (n==1) {
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

/*

Enter sumRecursion - callnum 1 n 3
before callnum 1 newnum 2
Enter sumRecursion - callnum 2 n 2
before callnum 2 newnum 1
Enter sumRecursion - callnum 3 n 1
--- end of condition total 1
Return n 1 total 1
  after n 2 total 3
Return n 2 total 3
  after n 3 total 6
Return n 3 total 6
at the end startnum 3 total 6

*/
