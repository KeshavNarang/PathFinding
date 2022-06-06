/*

// Original Code

public class Fibonacci
{
	 public static long F(int N)
	 {
		 if (N == 0) return 0;
		 if (N == 1) return 1;
		 return F(N-1) + F(N-2);
	 }
	 public static void main(String[] args)
	 {
		 for (int N = 0; N < 100; N++)
		 System.out.println(N + " " + F(N));
	 }
}

*/

// After one hour, 53 Fibonacci numbers had printed

// Keshav's Code

public class Fibonacci
{
	 public static long [] fibonacciNumbers = new long [100];
	 public static long F(int N)
	 {
		 if (N == 0) 
			 fibonacciNumbers[N] = 0;
		 else if (N == 1)
			 fibonacciNumbers[N] = 1;
		 else
			fibonacciNumbers[N] = fibonacciNumbers[N-1] + fibonacciNumbers[N-2];
		 return fibonacciNumbers[N];
	 }
	 public static void main(String[] args)
	 {
		 for (int N = 0; N < 100; N++)
		 System.out.println(N + " " + F(N));
	 }
}