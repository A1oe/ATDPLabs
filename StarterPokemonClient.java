import java.util.Scanner;

/**
 * @author Alyssa Lo
 *
 */
public class StarterPokemonClient {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// Basic Program That Tells You About Starter Pokemon

		String name = "";
		int health = 0;
		Scanner console = new Scanner(System.in);

		while (!name.equals("quit")){ // Infinite Until 'Quit'
			System.out.println("Please Type In A Starter Pokemon Type (Fire, Water, or Grass): "); // Headers
			System.out.println("Type In \"Quit\" To Stop Program.");

			name = console.nextLine().toLowerCase();

			// Makes Sure Type Is Valid
			while (!name.equals("fire") && !name.equals("grass") && !name.equals("water") && !name.equals("quit")) {
				System.out.println("Type Not Recognized. Please Type In A Starter Pokemon Type (Fire, Water, or Grass): ");
				name = console.nextLine().toLowerCase();
			}

			if (!name.equals("quit")){
				System.out.println("Please Type In A Random HP Amount For Fun: ");
				health = console.nextInt();

				while (health < 0) {
					System.out.println("Error. Please Retype In A Random HP Amount For Fun: ");
					health = console.nextInt();
				}

				String unneededLine = console.nextLine(); // How do I get rid of this?
			}
			// Runs If Type Is Valid
			if (name.equals("fire")) {
				Fire fireType = new Fire(name, health); // New Object

				printSomeData(fireType); // Print Object Using Method
			} 
			if (name.equals("grass")) {
				Grass grassType = new Grass(name, health); // New Object

				printSomeData(grassType); // Print Object Using Method
			} 
			if (name.equals("water")) {
				Water waterType = new Water(name, health); // New Object

				printSomeData(waterType); // Print Object Using Method
			} 

		}
		console.close();
	}

	public static void printSomeData(Object typeName){ // Method That Prints Data
		System.out.println(typeName + "\n");
	}

}