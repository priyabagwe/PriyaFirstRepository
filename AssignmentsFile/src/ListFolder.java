import java.io.*;
public class ListFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	           
		File file = new File("C:\\TestFile");
	        String[] fileList = file.list();
	        for(String name:fileList){
	            System.out.println(name);
	        }
	    }
	
	}


