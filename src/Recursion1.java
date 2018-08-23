
public class Recursion1 {

	public static int total = 0;
	
	public static void main(String[] args) {

		int startnum = 0;
		
		sumRecursion(0, startnum);
		System.out.println("After recursion total= " + total);

	}
	
	private static void sumRecursion(int callnum, int n) {
		int localtotal;
		
		callnum++;
		if (callnum <=3) {
			localtotal = n + 1;
			total = n + 1;
			System.out.println("Before In sumRecursion callnum " + callnum + " localtotal " + localtotal + " total " + total);
			sumRecursion(callnum, localtotal);
			System.out.println("After In sumRecursion callnum " + callnum + " localtotal " + localtotal + " total " + total);
		}
	}

}

/*
Before In sumRecursion callnum 1 localtotal 1 total 1
Before In sumRecursion callnum 2 localtotal 2 total 2
Before In sumRecursion callnum 3 localtotal 3 total 3
After In sumRecursion callnum 3 localtotal 3 total 3
After In sumRecursion callnum 2 localtotal 2 total 3
After In sumRecursion callnum 1 localtotal 1 total 3
After recursion total= 3
*/