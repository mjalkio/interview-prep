package ch01_ArraysAndStrings.q03_URLify;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class URLifyTest {
	@Test
	public void test() {
		assertArrayEquals("Mr%20John%20Smith".toCharArray(),
				URLify.urlify("Mr John Smith    ".toCharArray(), 13));
		assertArrayEquals("%20".toCharArray(),
				URLify.urlify("   ".toCharArray(), 1));
		assertArrayEquals("hello%20%20%20world".toCharArray(),
				URLify.urlify("hello   world      ".toCharArray(), 13));
		assertArrayEquals("test".toCharArray(),
				URLify.urlify("test".toCharArray(), 4));
		assertArrayEquals("%20%20".toCharArray(),
				URLify.urlify("      ".toCharArray(), 2));
		assertArrayEquals("why%20".toCharArray(),
				URLify.urlify("why   ".toCharArray(), 4));
		assertArrayEquals("%20lol".toCharArray(),
				URLify.urlify(" lol  ".toCharArray(), 4));
		assertArrayEquals("%20lol".toCharArray(),
				URLify.urlify(" lol  ".toCharArray(), 4));
		assertArrayEquals("test ".toCharArray(),
				URLify.urlify("test ".toCharArray(), 4));
		assertArrayEquals("t%20est ".toCharArray(),
				URLify.urlify("t est   ".toCharArray(), 5));
	}
}
