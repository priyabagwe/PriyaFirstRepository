import java.util.Scanner;

public class Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Program Without Using Third Variable
		int X, Y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values of X and Y");
		X=sc.nextInt();
		Y=sc.nextInt();
		System.out.println("Before Swapping \nX = "+X+"\nY = "+Y);
		
		X=X*Y;
		Y=X/Y;
		X=X/Y;
		System.out.println("After Swapping \nX = "+X+"\nY = "+Y);
		sc.close();
		
		
	}

}
