import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
	
	public static void main(String[] args){
		try {
			FileReader reader = new FileReader("input.txt");
			int character;
			while ((character = reader.read()) != -1){
				System.out.print((char) character);
			}
			reader.close();
		} catch (IOException e){
			System.out.println("Couldn't find file.");
			//e.printStackTrace();
		}
	}
}