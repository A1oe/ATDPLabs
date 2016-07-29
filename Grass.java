/**
 * @author Alyssa
 *
 */
public class Grass implements Interface {

	/* (non-Javadoc)
	 * @see interface_lab.Interface#nameType(java.lang.String)
	 */
	private String name;
	private int healthPoints;
	// Constructor Method
	public Grass (String typeName, int HP){
		name = typeName;
		hpRandomChange(HP);
	}
	// How I want it formatted. Accessor Method.
	public String toString(){
		return "Name: " + nameType(name) + "\nWeakness: " + weak() + "\n\t" + 
		howWeak() + " Times Weaker\nAdvantage Over: " + Strength() + 
		"\n\t" + howStrong() + " Times Stronger\n" + "New Random Health: " + healthPoints;
	}
	@Override
	public String nameType(String name) {
		// Returns Name of Type. Accessor Method
		return name;
	}

	@Override
	public String weak() {
		// Returns What This Type Is Weak Against. Accessor Method
		return "Fire";
	}

	@Override
	public double howWeak() {
		// How Many Times Weaker It Is. Accessor Method
		return 0.5;
	}

	@Override
	public String Strength() {
		// Returns What This Type Is Strong Against. Accessor Method
		return "Water";
	}

	@Override
	public double howStrong() {
		// How Many Times Stronger. Accessor Method
		return 2.0;
	}
	@Override
	public void hpRandomChange(int HP) {
		// Changes Health Points Randomly For Fun. Mutator Method.
		int newRandomHealth;
		newRandomHealth = HP - (int)(Math.random() * 20 + 1);
		if(newRandomHealth < 0){
			newRandomHealth = 0;
		}
		healthPoints = newRandomHealth;
	}

}
