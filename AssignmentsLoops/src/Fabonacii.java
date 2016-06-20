
public class Fabonacii {

public static void main(String[] args) {
//TODO Auto-generated method stub

		int Fibo1=0,Fibo2=1,Fibo3,n, count=10;
		System.out.print(Fibo1+" "+Fibo2);
		
		for (n=2;n<count;++n)
		{
			Fibo3=Fibo1+Fibo2;
			System.out.print(" "+Fibo3);
			Fibo1=Fibo2;
			Fibo2=Fibo3;
		}
	}
}
		
		
	