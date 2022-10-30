package pword;

public class PasswordLists {
	
	public static final String[] alphaList = generateAlpha();
	public static final String[] numList = generateNumbers();
	public static final String[] symbolList = generateSymbols();

	private static String[] generateAlpha() {
		String[] temp = new String[52];

		int i = 0;
		for (char c = 'a'; c <= 'z'; c++) {
			temp[i] = c + "";
			i++;
		}
		
		for(char d = 'A'; d <= 'Z'; d++) {
			temp[i] = d+"";
			i++;
		}

		return temp;

	}

	private static String[] generateNumbers() {
		String[] temp = new String[10];

		for (int i = 0; i < 10; i++) {
			temp[i] = i + "";
		}

		return temp;

	}

	private static String[] generateSymbols() {
		String[] temp = { "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "?", "/", "<", ">", ".",
				"," };
		
		return temp;
	}

}
