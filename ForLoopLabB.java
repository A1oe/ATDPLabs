/**
 * 
 */

/**
 * @author atdp-11 Alyssa Lo
 *
 */
public class ForLoopLabB {
	public static void main(String[] args) {
		nameForLoop ();
		forLoopMethod ();
		FibForLoopMethod ();
		printPatternMethod ();
	}
	
	public static void nameForLoop () {
		// print your name + the iterator to the console 50 times using a for loop
		
		for(int i = 1; i < 51; i++){
			System.out.print("Alyssa Lo" + " " + i + " ");
		}
		System.out.println();
	}
	
	public static void forLoopMethod () {
		// Exercise #2, pg 12
		// Write a for loop that produces the following output:
		// 1 4 9 16 25 36 49 64 81 100
		
		for(int i = 0; i < 10; i++){
			System.out.print((i+1)*(i+1) + " ");
		}
		System.out.println();
	}
	
	static void FibForLoopMethod () {
		// Exercise #3, pg 125
		// Write a for loop to produce the Fibonacci sequence:
		// 1 1 2 3 5 8 13 21 34 55 89 144 
		
		int x = 1;
		int y = 1; 
		System.out.print(x + " " + y + " ");
		for(int i = 0; i < 10; i++){
			int z = x + y;
			System.out.print(z + " ");
			x = y;
			y = z;
		}
		System.out.println();
	}
	
	static void printPatternMethod () {
		// write a for loop that keeps the total count of adding
		// every odd number. When the loop is done and before
		// the method is finished, print the total. This method
		// should only print one line
		
		int x=0;
		for(int i = 1; i < 144; i = i + 2){
			x = x + i;
		}
		System.out.println("Total is " + x + ".");
	}
}