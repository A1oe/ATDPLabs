/*
 * Alyssa Lo
 */

public class ForLoopLabA {
	public static void main(String[] args) {
		nameLoop();
		boxLoop ();
		numbersLoop ();
		numbersBackwardsLoop ();
	}
	
	public static void nameLoop () {
		// change the below to use a for loop
		
		for(int i = 0; i < 6; i++){
			System.out.println("james");
		}
	}
	
	public static void boxLoop () {
		// change the following statements into a for loop
		
		for(int i = 0; i < 3; i++){
			System.out.println ("+------------+");
			System.out.println ("|            |");
			System.out.println ("|            |");
			System.out.println ("+------------+");
		}
	}
	
	public static void numbersLoop () {
		// Write a for loop to print 4 through 10 to the console
		// 4 5 6 7 8 9 10
		
		for(int i = 4; i <=10; i++){
			System.out.print(i + " ");
		}
		System.out.println();	
	}
	
	public static void numbersBackwardsLoop () {
		// write a for loop to print 10 through 0 to the console
		// 10 9 8 7 6 5 4 3 2 1 0
		
		for(int i = 10; i>=0; i--){
			System.out.print(i + " ");
		}
	}
}