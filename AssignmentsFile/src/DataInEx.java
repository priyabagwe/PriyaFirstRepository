
import java.io.*;
public class DataInEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		DataInputStream dis = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter two numbers");
		int a = Integer.parseInt(d.readLine());
		int b = Integer.parseInt(d.readLine());
		
		 System.out.println("Multiplication "+ " " + a + "X" + b +" "+ "is" + ":" + (a * b)); 
		 dis.close();
	}
		catch(IOException e)
		{
			System.out.println("Error" + e.getMessage());
		}

}}