import java.util.*;

public class ListGenericExample {
	public static void main(String[] args){
		List<String> names = new ArrayList<>();
		names.add("Julie");
		names.add("Janice");
		
		System.out.println(names);
		
		names.remove(1);
		
		System.out.println(names);
	
		
	}
}