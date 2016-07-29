/**
 * 
 */

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
