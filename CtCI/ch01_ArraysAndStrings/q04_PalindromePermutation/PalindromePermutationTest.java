package ch01_ArraysAndStrings.q04_PalindromePermutation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromePermutationTest {
	@Test
	public void test() {
		String[] trueInputs = { " ", "Tact Coa", "racecar", "rraacce", "aa",
				"lol", "aaaa", "aaa", "ab ab" };
		for (String s : trueInputs) {
			assertTrue(s, PalindromePermutation.palindromePermutation(s));
		}

		String[] falseInputs = { "cat", "", "True" };
		for (String s : falseInputs) {
			assertFalse(s, PalindromePermutation.palindromePermutation(s));
		}
	}
}
