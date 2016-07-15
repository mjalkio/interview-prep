package ch01_ArraysAndStrings.q01_IsUnique;

import java.util.HashSet;
import java.util.Set;

/**
 * O(n) solution that takes O(n) space.
 * 
 * @author Michael Jalkio
 *
 */
public class SetIsUnique {
	/**
	 * Tests if this string has all unique characters.
	 * 
	 * @param input
	 *            the string to test
	 * @return true if the string has all unique characters, false otherwise
	 */
	public static boolean isUnique(String input) {
		Set<Character> characters = new HashSet<Character>();
		for (Character c : input.toCharArray()) {
			if (characters.contains(c)) {
				return false;
			}

			characters.add(c);
		}

		return true;
	}
}
