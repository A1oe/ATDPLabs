// **********************While Loop Lab ************************

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

//************************Console Lab*******************************

/**
 * @author atdp-11 Alyssa Lo
 *
 */

import java.util.*;

public class ConsoleLab {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// Interactive Console Lab
		
		questionOne(); 
		System.out.println();
		questionTwo();
		System.out.println();
		questionThree();

	}
	
	public static void questionOne(){
		Scanner input = new Scanner(System.in); // Creates New Scanner Object
		
		System.out.println("Welcome to Question 1!\nPlease input an integer and then press Enter: ");
		int integer = input.nextInt(); // Reads Console's Integer
		
		while (integer != 0){ // Repeats Until User Inputs 0
			System.out.println("Invalid input. Please input the integer \"0\" and then press Enter: ");
			integer = input.nextInt(); // Reads Console's Integer
		}
		
		System.out.println("You inputed " + integer + ", which is an "); // Returns Integer To Console
		
		if (integer % 2 == 0){ // State Whether Even Or Odd
			System.out.println("even number."); 
		} else {
			System.out.println("odd number.");
		}
		System.out.println("Yay!"); // Finisher
	}
	
	public static void questionTwo(){
		Scanner input = new Scanner(System.in); // Creates New Scanner Object
		
		System.out.println("Welcome to Question 2!\nPlease write a sentence and then press Enter: ");
		String sentence = input.nextLine(); // Reads Console's Sentence
		System.out.println("You wrote: " + sentence + "\n" + "The length of this String is " + sentence.length() + ".");
		
		while (sentence.length() != 10){ // Continues Until Length = 10
			System.out.println("You wrote: " + sentence + "\n" + "The length of this String is " + sentence.length() + ".\nPlease input a sentence whose length is 10: "); // Forces People To Write A 10 Character Sentence
			
			sentence = input.nextLine(); // Reads Console's Sentence 
		}
		System.out.println("Yay!"); // Finisher
	}
	
	public static void questionThree(){
		Scanner input = new Scanner(System.in); // Creates New Scanner Object
		
		System.out.println("Welcome to Question 3!\nPlease input a random integer from 1 to 5: "); 
		int x = (int)(Math.random()*5 + 1); // Random Number Generator
		int z = input.nextInt(); // Reads Console's Integer
		
		while (z != x){ // Execute Until User Guesses Random Number
			System.out.println("Try Again. Please input a random integer from 1 to 5: ");
			z = input.nextInt(); // Reads Console's Integer
		}
		
		System.out.println("Good guess!"); 
		System.out.println("Yay!"); // Finisher
	}

}

