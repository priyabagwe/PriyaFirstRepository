import java.io.Console;

public class ConsEx {

	public static void main(String[] args) {
		Console c = System.console();
		System.out.println("Enter two numbers");
		int a = Integer.parseInt(c.readLine());
		int b = Integer.parseInt(c.readLine());
		System.out.println(a/b);
    }
    }
	
