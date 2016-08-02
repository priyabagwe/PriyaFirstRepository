
public class NullpointerEx {

	static void change(String str)
	{
		try {
			str=str.substring(2);
			System.out.println(str);
		}
		catch(NullPointerException e){
			System.out.println("Null pointer Exception Occured");
			e.printStackTrace();
		}
		catch(Exception e)
		{
		System.out.println(" Exception is Handled ");
			
		}
		finally{
	System.out.println("Exception Handled Successfully");
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = null;
		NullpointerEx.change(str);
		
	}

}
