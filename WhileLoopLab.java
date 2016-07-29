/**
 * 
 */

/**
 * @author atdp-11 Alyssa Lo
 *
 */
public class WhileLoopLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// While Loop Lab

		questionOne(); // While Loop That Prints Name To Console 5 Times
		System.out.println();
		questionTwo(); // While Loop That Prints Name 5 Times w/ Boolean
		System.out.println();
		questionThree(); // While Loop That Prints 1 - 10 & If They Are Even Or Odd
		System.out.println();
		questionFour(); // While Loop That Prints Loop As Long As i < 30
		System.out.println();
		questionFive(); // While Loop That Prints Location Of 'r'
	}

	public static void questionOne() {
		int x = 1; // "Counter"

		while (x <= 5){
			System.out.print("Alyssa Lo ");
			x++; // Changes "Counter"
		}
		System.out.println();
	}

	public static void questionTwo() {
		boolean flag = false; // Boolean Variable
		int x = 0; // "Counter"

		while (flag == false){ 
			if (x == 5){ 
				flag = true;
			} else { // Prints 5 times
				System.out.print("Alyssa Lo ");
				x++; // Changes "Counter"
			}
		}
		System.out.println();
	}

	public static void questionThree() { 
		int x = 1; // Inital Number

		while (x <= 10){
			System.out.print(x + " is an "); // First Half Of Statment
			if (x % 2 == 0){ // Checks If x Is Even Or Odd
				System.out.println("even number");
			} else { 
				System.out.println("odd number");
			}
			x++;
		}
	}

	public static void questionFour() {
		int i = 0; // "Counter"

		while (i < 30){ // As Long As i < 30
			System.out.print("loop");
			i+=3; // Increase By An Increment of 3
		}
		System.out.println();	
	}

	public static void questionFive() {
		boolean flag = false; // Boolean Variable
		String CA = "California"; // California
		int x = 0; // "Counter"
		
		while (flag == false){
			
			int a = CA.indexOf(x); 
			
			if (a == CA.indexOf("r")){ // When a Is At the Position 'r'
				System.out.print("character found at position " + (a + 1) ); 
				flag = true;
			} else {
				x++;
			}
		}
	}
}
