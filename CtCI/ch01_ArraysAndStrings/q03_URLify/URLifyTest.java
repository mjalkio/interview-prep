package ch01_ArraysAndStrings.q03_URLify;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class URLifyTest {
	private char[] testArr;

	private void prepareTestArr(String input, int trueLength) {
		testArr = input.toCharArray();
		URLify.urlify(testArr, trueLength);
	}

	@Test
	public void test() {
		prepareTestArr("Mr John Smith    ", 13);
		assertArrayEquals("Mr%20John%20Smith".toCharArray(), testArr);
		prepareTestArr("   ", 1);
		assertArrayEquals("%20".toCharArray(), testArr);
		prepareTestArr("hello   world      ", 13);
		assertArrayEquals("hello%20%20%20world".toCharArray(), testArr);
		prepareTestArr("test", 4);
		assertArrayEquals("test".toCharArray(), testArr);
		prepareTestArr("      ", 2);
		assertArrayEquals("%20%20".toCharArray(), testArr);
		prepareTestArr("why   ", 4);
		assertArrayEquals("why%20".toCharArray(), testArr);
		prepareTestArr(" lol  ", 4);
		assertArrayEquals("%20lol".toCharArray(), testArr);
		prepareTestArr(" lol  ", 4);
		assertArrayEquals("%20lol".toCharArray(), testArr);
		prepareTestArr("test ", 4);
		assertArrayEquals("test ".toCharArray(), testArr);
		prepareTestArr("t est   ", 5);
		assertArrayEquals("t%20est ".toCharArray(), testArr);
	}
}
