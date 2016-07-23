package ch01_ArraysAndStrings.q05_OneAway;

/**
 * O(n) solution that takes O(1) space.
 * 
 * Note: O(n) because the string lengths can differ by at most 1 (if they differ
 * by more than that it will run in constant time).
 * 
 * @author Michael Jalkio
 *
 */

public class OneAway {

	public static boolean oneAway(String s1, String s2) {
		if (s1.equals(s2)) {
			return true;
		} else if (s1.length() == s2.length()) {
			boolean foundDifference = false;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					if (foundDifference) {
						return false;
					} else {
						foundDifference = true;
					}
				}
			}
			return true;
		} else if (Math.abs(s1.length() - s2.length()) > 1) {
			return false;
		} else {
			String longer, shorter;
			if (s1.length() > s2.length()) {
				longer = s1;
				shorter = s2;
			} else {
				longer = s2;
				shorter = s1;
			}
			boolean foundAdded = false;
			for (int i = 0; i < shorter.length(); i++) {
				if (foundAdded) {
					if (shorter.charAt(i) != longer.charAt(i + 1)) {
						return false;
					}
				} else {
					if (shorter.charAt(i) != longer.charAt(i)) {
						foundAdded = true;
					}
				}
			}
			return true;
		}
	}

}
