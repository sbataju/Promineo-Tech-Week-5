package week5;

public class App {

	public static void main(String[] args) {
		String word = "ILIKEJAVA";
		
		Logger astLog = new AsteriskLogger();
		System.out.println("Asterisk Logger: ");
		astLog.Log(word);
		astLog.Error(word);
		
		Logger spcLog = new SpacedLogger();
		System.out.println("\nSpaced Logger: ");
		spcLog.Log(word);
		spcLog.Error(word);

	}

}
