/**
 * 
 */

/**
 * @author atdp-11 Alyssa Lo
 *
 */

import java.util.*;

public class TwoDimensionalArrayLab {

	public static void main(String[] args) {
		// 2D Array Lab w/ Tweaks

		int [][] chessBoard = {{1, 3, 4, 4, 7, 8, 9}, // Initial Array
				{12, 43, 54, 1, 7, 20, 9},
				{33, 6, 2, 1, 7, 9, 1},
				{6, 87, 2, 23, 21, 1, 10}};

		int [] questions = {findMax(chessBoard), findMin(chessBoard), addThree(chessBoard), addElements(chessBoard), addAllEvenNumbers(chessBoard)};
		for (int i = 0; i < questions.length; i++){ // Prints Questions 1 - 5
			System.out.println(questions[i]);
		}

		classMateNames(); // Question 6
	}

	// Question 1
	public static int findMax (int[][] parameter){
		int max = 0; // Maximum 

		for (int row = 0; row < parameter.length; row++){ // Changes Row
			for (int column = 0; column < parameter[row].length; column++){ // Changes Column
				if (parameter[row][column] > max){ // Changes max If It Is No Longer The Largest
					max = parameter[row][column];
				}
			}
		}

		return max;
	}

	// Question 2
	public static int findMin (int[][] parameter){
		int min = 1000000000; // Initial Minimum 

		for (int row = 0; row < parameter.length; row++){ // Changes Row
			for (int column = 0; column < parameter[row].length; column++){ // Changes Column
				if (parameter[row][column] < min){ // Changes min If It Is No Longer The Smallest
					min = parameter[row][column];
				}
			}
		}

		return min;
	}

	// Question 3
	public static int addThree (int[][] parameter){
		for (int row = 0; row < parameter.length; row++){ // Changes Row
			for (int column = 0; column < parameter[row].length; column++){ // Changes Column
				parameter[row][column] += 3; // Add 3 To Each
			}
		}

		return parameter[3][1];
	}

	// Question 4
	public static int addElements (int[][] parameter){
		int sum = parameter[3][4] + parameter[2][3];

		return sum;
	}

	// Question 5
	public static int addAllEvenNumbers (int[][] parameter){
		int sum = 0;

		for (int row = 0; row < parameter.length; row++){ // Changes Row
			for (int column = 0; column < parameter[row].length; column++){ // Changes Column
				if (parameter[row][column] % 2 == 0){
					sum += parameter[row][column]; // Finds Sum Of Even Numbers
				}
			}
		}

		return sum;
	}

	// Question 6
	public static void classMateNames (){
		Scanner console = new Scanner(System.in);
		int row = 0; 
		int column = 0;

		if (row <= 0){ // Only Natural Numbers
			while (row <= 0){
				System.out.println("Please Type In a Integer (row): "); // Finds Row
				row = console.nextInt();
			}
		}
		if (column <= 0){ // Only Natural Numbers
			while (column <= 0){
				System.out.println("Please Type In a Integer (column): "); // Finds Column
				column = console.nextInt();
			}
		}
		String [][] string_ray = new String [row][column]; // Makes Array With Inputed Integers

		for (int r = 0; r < row; r++){ // Change Row
			for (int c = 0; c < column; c++){ // Change Column
				System.out.println("What is one of your classmate's names? ");
				string_ray [r][c] = console.next(); // Stores Names In Each Element
			}
		}

		for (int r = 0; r < row; r++){ // Prints Names As Grid
			for (int c = 0; c < column; c++){
				System.out.print(string_ray [r][c] + " ");
			}
			System.out.println();
		}

		console.close();
	}
}
