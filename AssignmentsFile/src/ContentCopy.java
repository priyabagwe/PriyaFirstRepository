import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ContentCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String FName = "C:\\TestFile\\Priya.txt";
try{
		FileReader freader = new FileReader(FName);
		BufferedReader reader = new BufferedReader(freader);
		String oldtext = "";
		String line = "";
        while((line = reader.readLine()) != null)
        {
        oldtext += line + "\r\n";
        }
        String newtext = oldtext.replaceAll("happy", "sad");
        FileWriter writer = new FileWriter("C:\\TestFile\\Priya.txt");
        writer.write(newtext);
        writer.close();
        reader.close();
		System.out.println("Success");

    }
		catch(IOException e)
	{
	System.out.println("Error" + e.getMessage());
		}
            
	}

}
