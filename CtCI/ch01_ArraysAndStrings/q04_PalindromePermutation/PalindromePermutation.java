package ch01_ArraysAndStrings.q04_PalindromePermutation;

import java.util.HashMap;

public class PalindromePermutation {

	public static boolean palindromePermutation(String s) {
		if (s == null || s.length() == 0) {
			return false;
		}

		s = s.toLowerCase();
		HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();

		for (char c : s.toCharArray()) {
			if (c != ' ') {
				if (charCounts.containsKey(c)) {
					int newCount = charCounts.get(c) + 1;
					charCounts.put(c, newCount);
				} else {
					charCounts.put(c, 1);
				}
			}
		}

		boolean foundPivot = false;
		for (Character c : charCounts.keySet()) {
			if (charCounts.get(c) % 2 == 1) {
				if (foundPivot) {
					return false;
				} else {
					foundPivot = true;
				}
			}
		}

		return true;
	}

}
