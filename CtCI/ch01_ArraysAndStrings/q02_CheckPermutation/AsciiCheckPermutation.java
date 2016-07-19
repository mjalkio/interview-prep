package ch01_ArraysAndStrings.q02_CheckPermutation;

/**
 * O(n) solution that takes O(1) space. Assumes that we are only dealing with
 * ASCII characters (128 possible).
 * 
 * Note: O(n) because the strings will only be compared if they are the same
 * length.
 * 
 * @author Michael Jalkio
 *
 */

public class AsciiCheckPermutation {
	public static boolean checkPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		int[] charCounts = new int[128];

		for (char c : s1.toCharArray()) {
			charCounts[(int) c]++;
		}
		for (char c : s2.toCharArray()) {
			charCounts[(int) c]--;
			if (charCounts[(int) c] < 0) {
				return false;
			}
		}

		return true;
	}
}
