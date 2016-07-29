/**
 * 
 */

/**
 * @author atdp-11 Alyssa Lo
 *
 */

import java.util.*;

public class ArrayListForEachLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Array List and For Each Lab

		// Question One
		ArrayList <String> list = createList();

		for(int i = 0; i < list.size(); i++){
			String x = list.get(i);
			System.out.print(x + " ");
		}
		System.out.println();

		// Question 2
		reverseList(list);
		System.out.println();

		// Question 3
		ArrayList <String> list3 = capitalizePlurals(list);

		for(int i = 0; i < list.size(); i++){
			System.out.print(list3.get(i) + " ");
		}
		System.out.println();

		// Question 4
		ArrayList <String> list4 = removePlurals(list);

		for(int i = 0; i < list.size(); i++){
			System.out.print(list4.get(i));
		}
		
		// Question 6
		int[] a_ray = new int [10];
		for (int i = 0; i < a_ray.length; i++){
			a_ray[i] = (int)(Math.random()*10 + 1);
		}
		
		randomArray(a_ray);
		
	}

	// Question 1
	public static ArrayList <String> createList() {
		ArrayList <String> list = new ArrayList <String> (); // Create ArrayList numOne

		// Create List
		list.add("his");
		list.add("hose");
		list.add("hes");
		list.add("heys");

		return list;
	}

	// Question 2
	public static void reverseList(ArrayList <String> parameter) {
		String reversed; // Holder Variable

		for(int i = 0; i < parameter.size()/2; i++){ // Goes Through Each And Reverses Them
			reversed = parameter.get(i);
			parameter.set(i, parameter.get(parameter.size()-1-i));
			parameter.set(parameter.size()-1-i, reversed); 
		}

		for(int i = 0; i < parameter.size(); i++){ // Prints
			System.out.print(parameter.get(i) + " ");
		}

	}

	// Question 3
	public static ArrayList <String> capitalizePlurals (ArrayList <String> parameter){
		ArrayList <String> what = parameter; // Create New Array

		for (int i = 0; i < what.size(); i++){ // Look Through Each Element
			String str = what.get(i); // Make str = Each Element

			if (str.endsWith("s")){ 
				what.set(i,str.toUpperCase()); // Change to UpperCase
			}
		}

		return what;
	}

	// Question 4
	public static ArrayList <String> removePlurals(ArrayList <String> parameter){
		ArrayList <String> what = parameter; // Create New Array

		for (int i = 0; i < what.size(); i++){ // Looks At Each Element
			String str = what.get(i);

			if (str.endsWith("s") || str.endsWith("S")){
				what.remove(i);
				i--;
			}
		}

		return what;
	}
	
	// Question 6
	public static void randomArray (int [] parameter){
		int sum = 0;
		
		for (int a : parameter){
			if (a == 8){
				sum++;
			}
		}
		System.out.println("Number of times 8 appears: " + sum);
	}
}
