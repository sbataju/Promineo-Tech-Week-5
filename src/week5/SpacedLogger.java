package week5;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String a) {
		System.out.println(addSpaces(a));
	}

	@Override
	public void Error(String b) {
		System.out.println("Error: " + addSpaces(b));
	}
	
	/*
	 * This method takes a String and returns a StringBuilder
	 *  with spaces added between each character.
	 */
	private StringBuilder addSpaces(String word)
	{
		StringBuilder spacedString = new StringBuilder();
		for(int i = 0; i < word.length(); i++)
		{
			spacedString.append(word.charAt(i));
			spacedString.append(' ');
		}
		
		return spacedString;
		
	}


}
