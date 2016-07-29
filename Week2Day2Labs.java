//************** NESTED LOOP LAB**************************

/**
 * 
 */

/**
 * @author atdp-11 Alyssa Lo
 *
 */
public class NestedLoopLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Calls each method
		
		starBlock(); // Question #1
		arrowRain(); // Question #2
		numPyramid(); // Question #3
		numRow(); // Question #4
		tinyNumPyramid(); // Question #5
	}
	
	public static void starBlock(){
		// Question Number 1 (four rows of 5 stars)
		
		for (int row = 0; row < 4; row++){
			for (int star = 0; star < 5; star++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void arrowRain(){
		// Question #2 (triangle of ^, 6 rows)
		
		for (int row = 0; row < 6; row++){
			for (int arrow = 0; arrow <= row; arrow++){
				System.out.print("^");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void numPyramid(){
		// Question #3 (triangle of #'s correlating to row, 7 rows)
		
		for (int row = 1; row <= 7; row++){
			for (int num = 1; num <= row; num++){
				System.out.print(row);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void numRow(){
		// Question #4 (5 rows of #'s correlating to row)
		
		for (int row = 1; row <= 5; row++){
			for (int num = 1; num == 1; num++){
				System.out.print(row);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void tinyNumPyramid(){
		// Question #5 (4 rows of #'s, 3 to 7)
		
		for (int row = 3; row <= 7; row++){
			for (int num = 2; num < row; num++){
				System.out.print(row);
			}
			System.out.println();
		}
	}
	
}


//********************STRING LAB****************************

/**
 * 
 */

/**
 * @author atdp-11 Alyssa Lo
 *
 */
public class StringLab {

	/**
	 * @param args
	 */
	
	final static String name = "alyssa lo";
	
	public static void main(String[] args) {
		// String Lab, Calls the methods	
		
		lenName();
		oneChar();
		middleChar();
		subString();
		caps();

	}
	
	public static void lenName(){
		// Question #1: length of name
		
		int len = name.length();
		System.out.println(len);
	}
	
	public static void oneChar(){
		// Question #2: first character of name
		
		System.out.println(name.charAt(0));
	}
	
	public static void middleChar(){
		// Question #3: middle character of name
		
		System.out.println(name.charAt(4));
	}
	
	public static void subString(){
		// Question #4: Substring from first character to middle
		
		System.out.println(name.substring(0,5));
	}
	
	public static void caps(){
		// Question #5: lowercase name to uppercase
		
		System.out.println(name.toUpperCase());
	}

}

