/**
 * 
 */

/**
 * @author atdp-11 Alyssa Lo
 *
 */
import java.util.*;

public class ArrayLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Array Lab
	
		randomArray(); // Question 3
		familyArray(); // Question 4
		//consoleArray(); // Question 5
		
		//int integer = 1; // Question 6
		//System.out.println(multiplySumArray(integer));
		
		upperCase(); // Question 7
	}
	
	// Question 1
	public static void printIntArray (int [] parameter){
		for (int i = 0; i < parameter.length; i++){ // Loop To Print Each Element (int)
			System.out.print(parameter[i] + " ");	
		}
		
		System.out.println();
	}
	
	// Question 2
	public static void printStringArray (String [] parameter){
		for (int i = 0; i < parameter.length; i++){ // Loop To Print Each Element (String)
			System.out.print(parameter[i] + " ");
		}
		System.out.println();
	}
	
	// Question 3
	public static void randomArray (){ 
		int [] a_ray = new int [10]; // Creates 10 Random Numbers In An Array
		for (int i = 0; i < a_ray.length; i++){
			a_ray[i] = (int)(Math.random()*100+1);
		}
		printIntArray(a_ray); // a_ray Is The Parameter 
	}
	
	// Question 4
	public static void familyArray(){
		String [] a_ray = {"Alyssa", "Amanda", "Mom", "Dad"}; // Create String Array With Fam's Names
		printStringArray(a_ray); // Prints a_ray
		
 	}
	
	// Question 5
	public static void consoleArray(){
		Scanner console = new Scanner(System.in); 
		int [] a_nother_ray = new int[10];
		for (int i = 0; i < 10; i++){ // Input 10 Numbers
			System.out.println("Please Input A Number: "); 
			a_nother_ray[i] = console.nextInt(); // Puts Numbers Into Array
		}
		printIntArray(a_nother_ray); // Prints Array
		console.close();
	}
	
	// Question 6
	public static int multiplySumArray(int para){
		int [] sting_ray = new int [10]; // Array of Size 10
		int sum = 0;
		
		for (int i = 0; i < sting_ray.length; i++){
			sting_ray [i] = para; // Each Element Contains Int Parameter
			sting_ray [i] = para * i; // Multiplies Each Element By Iterator
		}
		
		for (int i = 0; i < sting_ray.length; i++){ // Finds Sum of All 10 Elements
			sum += sting_ray [i];
		}
		
		return sum;
	}
	
	// Question 7
	public static void upperCase(){
		Scanner console = new Scanner(System.in); 
		String [] string_ray = new String[5]; // Array Of 5
				
		for (int i = 0; i < 5; i++){
			System.out.println("Please Input A Sentence: ");
			string_ray [i] = console.nextLine();
			string_ray [i] = string_ray [i].toUpperCase();
		}
				
		printStringArray(string_ray);		
		console.close();
	}
	
	// Question 8
	public static void findMe(){
		Scanner console = new Scanner (System.in);
		int [] long_ray = new int [100];
		
		for (int i = 0; i < long_ray.length; i++){
			long_ray [i] = (int)(Math.random() * 15 + 1);
		}
		
		System.out.println("Please Guess An Integer From 1 - 15: ");
		int input = console.nextInt();
		
		for (int i = 0; i < long_ray.length; i++){
			if (long_ray[i] == input){
				System.out.println("Number is found in Position " + i);
				i += 10000000;
			} else if (i == long_ray.length - 1){
				System.out.println("not found");
			}
		}
	}
}


