
import java.util.Scanner;

public class FactorialRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N, fact=1;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Number" );
		N = Sc.nextInt();
		System.out.println("Number is = " +N );
		Sc.close();
		fact = factorial(N);
		System.out.println("Factorial of number" + " " + N + " is" + " " +fact);
	}
	
		public static int factorial(int N)
		{
		if (N==0)
			return 1;
		else 
			return N*factorial(N-1);
		}
}
