package week5;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String a) {
		System.out.println("***" + a +"***");
	}

	@Override
	public void Error(String b) {
		boxOfAsterisk(b);
	}
	
	/*
	 * This method takes a string and prints it out enclosed in a box of asterisks
	 * with an "Error: " message before the string.
	 */
	private void boxOfAsterisk(String word) {
		for (int i = 0; i < (word.length() + 13); i++) {
			System.out.print('*');
		}
		
		System.out.println("\n***Error: " + word + "***");
		
		for (int i = 0; i < (word.length() + 13); i++) {
			System.out.print('*');
		}
		System.out.println("");
	}


}
