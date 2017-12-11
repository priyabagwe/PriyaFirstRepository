import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			int temp;
			boolean isprime = true;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int number = sc.nextInt();
			sc.close();
			for (int i=2; i<=number/2;i++)
			{
				temp=number%i;
				if(temp==0)
			
			{
			isprime=false;
			break;	
			}
			}
			if (isprime)
				System.out.println(number + " " + " is a prime number");
			else
				System.out.println(number + "" + "is not a prime");
}
}
