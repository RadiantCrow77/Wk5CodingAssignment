
public class CodingAssignmentWk5 {

	public static void main(String[] args) {
	
	String idk = "Jack";
	String idk2 = "Daniel";
	
	Log(idk);
	Error(idk2);

	} // end main method
	
	// 2. Add two void methods to the Logger interface, each should take in a string as an arg
	public static void Log(String idk) {
		// print String it receives in between 3 asterisks on either side of string
		System.out.println("***"+idk+"****");
	}
	public static void Error(String idk2) {
		// print String it receives between 3 asterisks on either side, proceeded by Error... aka
		// ***Error: Hello***
	System.out.println("***Error"+idk2+"***");
		
	}
	
	// 2. Add 2 void methods to the Logger interface, taking a String in as an arg
			// a. Log
			public void Log implements Logger{
				
			}
			// b. Error
			public void Error implements Logger{
				
			}

}
