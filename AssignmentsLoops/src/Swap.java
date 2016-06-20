
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Program with using third variable
		int X, Y,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values of X and Y");
		X=sc.nextInt();
		Y=sc.nextInt();
		System.out.println("Before Swapping \nX = "+X+"\nY = "+Y);
		
		temp=X;
		X=Y;
		Y=temp;
		System.out.println("After Swapping \nX = "+X+"\nY = "+Y);
		sc.close();
			
		}

}
