package ch01_ArraysAndStrings.q01_IsUnique;

/**
 * O(n^2) solution that takes O(1) space.
 * 
 * @author Michael Jalkio
 *
 */
public class InPlaceIsUnique {
	/**
	 * Tests if this string has all unique characters.
	 * 
	 * @param input
	 *            the string to test
	 * @return true if the string has all unique characters, false otherwise
	 */
	public static boolean isUnique(String input) {
		for (int i = 0; i < input.length() - 1; i++) {
			for (int j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					return false;
				}
			}
		}

		return true;
	}
}
