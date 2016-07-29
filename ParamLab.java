/**
 * 
 */

/**
 * @author atdp-11 Alyssa Lo
 *
 */
public class ParamLab {

	/**
	 * @param args
	 */
	
	final static int ROWS = 5; // Global Constant Variables for Question 5
	final static int COLUMNS = 4;
	
	public static void main(String[] args) {
		// Parameter Lab
		
		// Question #1
		int oneVar = 3;
		questionOne(oneVar);
		System.out.println(oneVar); //prints oneVar's original value
		
		// Question #2
		int twoVar = questionTwo(10); 
		System.out.println(twoVar);
		
		// Question #3
		double threeVar = questionThree(2,3);
		System.out.println(threeVar);
		
		// Question #4
		int fourVar = questionFour(2);
		System.out.println(fourVar); // Returns Sum
		
		// Question #5
		questionFive(); // Makes Star Grid
		
		// Question #6
		System.out.println(questionSix()); // Prints Random Integer
		
		// Question #7
		System.out.println(questionSeven()); // Prints Double in Question 3
	}
	
	public static void questionOne(int num){
		int x = num * num * num;  // Cube Parameter 
		System.out.print(x + " "); // Prints Cubed Number
	}
	
	public static int questionTwo (int num){
		return (num * num * num); // Returns and Cubes Parameter
	}
	
	public static double questionThree (int num1 , int num2){
		double x = Math.random(); // Creates Random Double Value
		return (x + num1 + num2); // Returns Random Number + The 2 Parameters
	}
	
	public static int questionFour (int num){
		int sum = 0; 
		for (int x = 1; x <= num; x++){
			sum = sum + x; // Finds Sum of All The Numbers From 0 To Parameter
		}
		return sum; // Returns Sum
	}
	
	public static void questionFive(){
		for (int x = 0; x < ROWS; x++){ // For Loop For Rows
			for (int a = 0; a < COLUMNS; a++){ // Nested For Loop For Columns
				System.out.print("*"); // Prints *
			}
			System.out.println(); // Makes A New Line
		}
	}
	
	public static int questionSix(){
		int randomNum = (int)(Math.random()*50 + 1); // Finds A Random Integer Between 1 And 50
		return randomNum; // Returns randomNum
	}
	
	public static double questionSeven(){
		double three = questionThree(2,3); // Calls Method From Question 3 Using Same Parameters (however, the number will be different)
		return three; // Returns The Double
	}

}
