package ch01_ArraysAndStrings.q02_CheckPermutation;

import java.util.HashMap;
import java.util.Map;

/**
 * O(n) solution that takes O(n) space.
 * 
 * Note: O(n) because the strings will only be compared if they are the same
 * length.
 * 
 * @author Michael Jalkio
 *
 */
public class MapCheckPermutation {
	public static boolean checkPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		Map<Character, Integer> charCounts = new HashMap<Character, Integer>();

		for (char c : s1.toCharArray()) {
			if (charCounts.containsKey(c)) {
				int newValue = charCounts.get(c) + 1;
				charCounts.put(c, newValue);
			} else {
				charCounts.put(c, 1);
			}
		}
		for (char c : s2.toCharArray()) {
			if (charCounts.containsKey(c)) {
				int newValue = charCounts.get(c) - 1;
				if (newValue < 0) {
					return false;
				} else {
					charCounts.put(c, newValue);
				}
			} else {
				return false;
			}
		}

		return true;
	}
}
