
public class SpacedLogger implements Logger{
	// add spaces between each character of the String argument passed into its methods.
	@Override
	public void Log(String logStr) {
	
		
	// need a stringbuilder to change the string
		StringBuilder finalStr = new StringBuilder();
		
	// loop through the string
		for(int i = 0; i<logStr.length(); i++) {
			if(i>0) { // only add space if at the "first el"
			// print at i and a space between each char
//			strChar[i]=(logStr.charAt(i)+" ")); // set = to the current value
			finalStr.append(' ');
		}
			finalStr.append(logStr.charAt(i));
		
		}	System.out.println(finalStr.toString()); // turn it back into a string + print
		
		
		
	}

	@Override
	public void Error(String errStr) {
		// basically doing the same thing, wanted to create a method to make this unrepetitive code but out of time
		errStr = "Bop";

		StringBuilder finalStr = new StringBuilder();
		
	// loop through the string
		for(int i = 0; i<errStr.length(); i++) {
			if(i>0) { 

			finalStr.append(' ');
		}
			finalStr.append(errStr.charAt(i));
			System.out.println("ERROR: "+finalStr.toString()); 
		}
		
	} // implement the Logger interface

}
