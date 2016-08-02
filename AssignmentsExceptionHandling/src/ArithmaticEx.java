
public class ArithmaticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		a=a+10;
		System.out.println("a"+ ":" + a);
	
		try{
		a=a/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Occured");
		}
		System.out.println(a);
		
	}
	
	

}
