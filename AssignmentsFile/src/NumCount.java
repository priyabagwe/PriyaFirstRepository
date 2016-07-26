import java.io.*;

public class NumCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			String FName = "C:\\TestFile\\Priya.txt";
		
		try {
			FileReader freader = new FileReader(FName);
			BufferedReader reader = new BufferedReader(freader);
			String cursor;
			String content="";
			int lines = 0;
			int words =0;
			int chars = 0;
			String searchword = "File";
			int SearchOccurrence = 0;
			while(( cursor = reader.readLine())!=null){
				//To count Lines
				lines+=1;
				content+=cursor;
		
				//To Count words
				String[]_words = cursor.split(" ");
				for (String w :_words)
				{
					words++;
					if(w.equalsIgnoreCase(searchword)){ // to search string in a file
					SearchOccurrence++;
				}
			}
		}
		
		chars = content.length();
		reader.close();

		System.out.println("File" + FName + "has");
		System.out.println(chars + "Characters" );
		System.out.println(words + "words and " + lines + " lines");
		System.out.println(SearchOccurrence + "SearchOccurrence");
		}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found");		
		}catch(IOException ex){
			System.out.println("" + ex.getMessage());
		}
	}
}
		

	


