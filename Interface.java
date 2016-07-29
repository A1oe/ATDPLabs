/* 
 * Alyssa Lo
 */

public interface Interface {
	public String nameType(String name); // What The Type Is Called (Accessor)
	public String weak(); // Weak Against Which Type (Accessor)
	public double howWeak(); // How Many Times Weaker (Accessor)
	public String Strength(); // Strong Against Which Type (Accessor)
	public double howStrong(); // How Many Times Stronger (Accessor)
	public void hpRandomChange(int healthPoints); // Randomly Changes HP (Mutator)
} 