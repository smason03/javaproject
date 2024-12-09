import java.io.*;

public class FileReadExample {
	
	public static void main(String[] args){
		FileReader reader = null;
		
		try {
			reader = new FileReader("input.txt");
			int character;
			while ((character = reader.read()) != -1){
				System.out.print((char) character);
			}
		} catch (FileNotFoundException e){
			System.out.println("Not found:" + 
				e.getMessage());
		} catch (IOException e){
			System.out.println("Couldn't find file.");
			e.printStackTrace();
		} finally {
			if (reader != null){
				try {
					reader.close();
				} catch (IOException e) {
					System.out.println("Err closing: " + 
						e.getMessage());
				}
			}
		}
}