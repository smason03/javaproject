import java.util.Scanner;

public class Dinosaur {
	public static void main (String[] args){
				
		int currentTime = 0;		
		
		int	tRexFeedTime = 8;
		int	brachioFeedTime = 7;
		int	triceroFeedTime = 12;
		
		int tRexPortionSize = 100;
		int brachioPortionSize = 250;
		int triceroPortionSize = 150;

		for (int i = 0; i<=23; i++) {
		
			currentTime = i;
			
			System.out.println("It's " + currentTime + " O'clock. ");

			if (currentTime == tRexFeedTime){
				System.out.println("Time to Feed" +
				" our T-Rex with " + tRexPortionSize + " of raw meat.");
			};

			if (currentTime == brachioFeedTime){
				System.out.println("Time to Feed" +
				" our BrachioSaur with " + brachioPortionSize + " of raw vegetables.");
			};
				
			if (currentTime == triceroFeedTime){
				System.out.println("Time to Feed" +
				" our Triceratops with " + triceroPortionSize + " of raw vegetables.");
			};
		}
			
	}
}