package ch02_LinkedLists.q06_Palindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ch02_LinkedLists.Node;

public class PalindromeTest {
	@Test
	public void test() {
		int[][] palindromes = { { 1, 1 }, { 1 }, { 1, 2, 3, 3, 2, 1 },
				{ 1, 2, 3, 4, 3, 2, 1 } };
		for (int[] test : palindromes) {
			Node list = new Node(test);
			assertTrue(LinkedListPalindrome.isPalindrome(list));
		}

		int[][] notPalindromes = { { 0, 1 }, { 1, 2, 3 } };
		for (int[] test : notPalindromes) {
			Node list = new Node(test);
			assertFalse(LinkedListPalindrome.isPalindrome(list));
		}
	}
}
