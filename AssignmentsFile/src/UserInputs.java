
import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner Sc = new Scanner (System.in);
		System.out.println("Enter two Numbers");
		int a = Sc.nextInt();
		int b =Sc.nextInt();
		System.out.println("Sum of the two numbers is:"+ (a+b));
		Sc.close();
		
	}

}
