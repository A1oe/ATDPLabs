/**
 * 
 */

/**
 * @author atdp-11 Alyssa Lo
 *
 */
public class ClassLab {
	
	// Question 1 : fields
	private String name; 
	private int age;
	private String job;

	// Question 2 : Constructors That Makes fields Have Default Value
	public ClassLab (){ 
		name = "Amanda"; 
		age = 19;
		job = "Lazy Bum";

	}

	// Question 3 : Private field = Parameter Being Passed In
	public ClassLab (String n, int a, String j){  
		this.name = n;
		this.age = a;
		this.job = j;

	}

	// Question 4 : Accessor Methods
	public String getName(){ 
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getProfession(){
		return job;
	}
	
	// Question 5 : Mutator Method
	public void setName (String parameter){
		this.name = parameter;
	}
	
	// Question 6 : toString
	public String toString () {
		String print = name + " " + age + " " + job;
		return print;
	}
	
	// Question 7 : Subtracting The Ages Using An Object Parameter
	public int getAgeDifference (ClassLab parameter){
		int difference = age - parameter.age;
		return difference;
	}
	
	// Question 8 : Create a static public String field variable
	public static String relation;
	
	// Question 9 : 
	public static String getRelation (){
		return relation;
	}
}
