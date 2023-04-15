// Week 5 -- Coding Assignment
		// Kathy Moss
		// Due 4/15 midnight

public class Wk5Assign implements Logger{ // forgot to name this app


		public void Log(String str1) {
			System.out.println("***");
		
		}

	
		public void Error(String str2) {
	System.out.println("error");
		
		}
		
	
	public static void main(String[] args) { // start main
		String stringA = new String();
		
		AsteriskLogger astLog= new AsteriskLogger();
		SpacedLogger spaceLog = new SpacedLogger();
	
		
		//actually calling the methods
		System.out.println("Asterisk Log: \n");
		astLog.Log("Beep");
		System.out.println( "\n");
		
		System.out.println("Spaced Log: \n");
		spaceLog.Log("Bop");
		System.out.println( "\n");
		
		System.out.println("Err log: \n");
		astLog.Error("Error msg");


	} // end main method

}
