package ch01_ArraysAndStrings.q09_StringRotation;

/**
 * O(n) solution that takes O(1) space.
 * 
 * Note: O(n) because the string lengths must be the same (if they differ it
 * will run in constant time).
 * 
 * @author Michael Jalkio
 *
 */
public class StringRotation {

	public static boolean stringRotation(String s1, String s2) {
		if (s1.equals(s2)) {
			return true;
		}
		if (s1.length() != s2.length()) {
			return false;
		}

		String bigString = s1 + s1;
		return isSubstring(bigString, s2);
	}

	private static boolean isSubstring(String bigString, String subString) {
		return bigString.indexOf(subString) != -1;
	}
}
