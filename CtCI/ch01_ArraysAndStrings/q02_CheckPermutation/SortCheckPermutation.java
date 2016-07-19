package ch01_ArraysAndStrings.q02_CheckPermutation;

import java.util.Arrays;

/**
 * O(nlogn) solution that takes O(n) space.
 * 
 * Note: O(n) because the strings will only be compared if they are the same
 * length.
 * 
 * @author Michael Jalkio
 *
 */
public class SortCheckPermutation {
	public static String sort(String s) {
		char[] strArray = s.toCharArray();
		Arrays.sort(strArray);
		return new String(strArray);
	}

	public static boolean checkPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		return sort(s1).equals(sort(s2));
	}
}
