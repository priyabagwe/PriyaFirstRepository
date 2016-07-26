import java.io.*;
public class FiletoFileCopy {

	public static void main(String[] args) throws Exception {
		new File("C:\\TestFile\\File1.txt");

		File destFile = new File("C:\\TestFile\\File2.txt");
		
		if (!destFile.exists()) {
			try {
				destFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		InputStream input = null;
		OutputStream output = null;

		try {

			input = new FileInputStream("C:\\TestFile\\File1.txt");

			output = new FileOutputStream("C:\\TestFile\\File2.txt");

			byte[] buf = new byte[1024];
			int bytesRead;

			while ((bytesRead = input.read(buf)) > 0) {
				output.write(buf, 0, bytesRead);
			}
			System.out.println("Succesfully Copied");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {

				if (null != input) {
					input.close();
				}
				
				if (null != output) {
					output.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	}
	

	
	
	
	
	
	
	