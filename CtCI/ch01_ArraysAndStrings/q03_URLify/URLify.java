package ch01_ArraysAndStrings.q03_URLify;

public class URLify {

	public static char[] urlify(char[] input, int length) {
		int numSpaces = 0;
		for (int i = 0; i < length; i++) {
			if (input[i] == ' ') {
				numSpaces++;
			}
		}

		int location = length - 1 + numSpaces * 2;
		for (int i = length - 1; i >= 0; i--) {
			if (input[i] == ' ') {
				location = location - 2;
				input[location] = '%';
				input[location + 1] = '2';
				input[location + 2] = '0';
			} else {
				input[location] = input[i];
			}
			location--;
		}

		return input;
	}

}
