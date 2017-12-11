
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,Q,temp;
		int n = 153;
		temp=n;
		while(n>0)
		{
			Q=n%10;
			System.out.println("Q"+Q);
			n=n/10;
			System.out.println("n"+n);
			c=c+(Q*Q*Q);
			System.out.println("c"+c);
		
		System.out.println("c is"+c);
		if (temp==c)
			System.out.println(temp + " " +"is a Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
		}}
	}


