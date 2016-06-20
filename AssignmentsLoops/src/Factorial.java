import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long N, fact=1, i;
		Scanner Sc = new Scanner (System.in);
		System.out.println("Enter the number");
		N = Sc.nextInt();
		System.out.println("Number is = " +N);
		for (i=1; i<=N; i++)
		{
			fact = (fact*i);
		}
		
		System.out.println("Value of Factorial = " +fact);
		Sc.close();

	}

}
