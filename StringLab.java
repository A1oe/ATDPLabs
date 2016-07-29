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
