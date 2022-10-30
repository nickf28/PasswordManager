package pword;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Password {

	public int length;
	public String password;

	public Password(int length) {
		password = generatePassword(length);
	}

	public String getPassword() {
		return password;
	}

	private static String generatePassword(int length) {

		String password = "";

		int alphaL = PasswordLists.alphaList.length;
		int numsL = PasswordLists.numList.length;
		int symbolL = PasswordLists.symbolList.length;

		boolean[] bList = generateRandomBoolList(length);
		int bListL = bList.length;

		for (int i = 0; i < length; i++) {

			Random r = new Random();

			String randomFalpha = PasswordLists.alphaList[r.nextInt(alphaL)];
			String randomFnum = PasswordLists.numList[r.nextInt(numsL)];
			String randomFsymbol = PasswordLists.symbolList[r.nextInt(symbolL)];

			boolean randomBool = bList[r.nextInt(bListL - 1)];

			int randNum = r.nextInt(2);

			if (randomBool) {

				switch (randNum) {
				case 0:
					password += randomFalpha;
				case 1:
					password += randomFnum;
				case 2:
					password += randomFsymbol;
				}

			} else {
				
				randNum = r.nextInt(2);
				
				switch (randNum) {
				case 0:
					password += randomFsymbol;
				case 1:
					password += randomFalpha;
				case 2:
					password += randomFnum;
				}

			}

		}
		
		char[] pChars = password.toCharArray();
		
		Collections.shuffle(Arrays.asList(pChars));

		return String.valueOf(pChars);
	}

	private static boolean[] generateRandomBoolList(int length) {

		boolean[] b = new boolean[2 * length];

		for (int i = 0; i < b.length; i++) {

			Random r = new Random();

			b[i] = r.nextBoolean();
		}

		return b;

	}

}
