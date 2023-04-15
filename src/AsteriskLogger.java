
public class AsteriskLogger implements Logger { // implement the Logger interface
	
	// 2. Add 2 void methods to the Logger interface, taking Strings in as an arg --
	

	
		// a. Log void method, string arg
	@Override
	public void Log(String logStr) {
		//print out the String it receives between 3 asterisks on either side of the String
		System.out.println("***"+logStr+"***");
	}

		// b. error void method
	@Override
	public void Error(String errStr) {
		// print the String inside a box of asterisks, with the String preceded by the word “ERROR:”
	System.out.println("************"+"\n"+"***ERROR: "+errStr+" ***"+"\n************");
	
		
	}

}
