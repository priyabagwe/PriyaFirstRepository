import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffReadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			InputStreamReader read = new InputStreamReader(System.in);
			BufferedReader buff = new BufferedReader(read);
			System.out.println("Enter two Numbers");
			int a = Integer.parseInt(buff.readLine());
			int b = Integer.parseInt(buff.readLine());
			System.out.println("Subtraction of the two numbers is:"+ (a-b));
			buff.close();
		}
			
			catch(IOException e)
			{
				System.out.println("Error" + e.getMessage());
			}

		}
		
		

	}


