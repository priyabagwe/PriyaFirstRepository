import java.util.Scanner;

public class PingPong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		Num = sc.nextInt();
			
		if (Num%3==0&& Num%5!=0)
		{
			System.out.println("PING");
		}else if (Num%5==0&& Num%3!=0){
			
			System.out.println("PONG");

		}else if (Num % 3==0 && Num % 5==0 ){
			System.out.println("PINGPONG");
		}else
			System.out.println(Num +" "+ "Number not Divisible by either 3 or 5");
		sc.close();	
	}

}
