package ch01_ArraysAndStrings.q03_URLify;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class URLifyTest {
	@Test
	public void test() {
		assertEquals("Mr%20John%20Smith".toCharArray(),
				URLify.urlify("Mr John Smith    ".toCharArray(), 13));
		assertEquals("%20".toCharArray(), URLify.urlify("   ".toCharArray(), 1));
		assertEquals("hello%20%20%20world".toCharArray(),
				URLify.urlify("hello   world      ".toCharArray(), 13));
		assertEquals("test".toCharArray(),
				URLify.urlify("test".toCharArray(), 4));
		assertEquals("%20%20".toCharArray(),
				URLify.urlify("      ".toCharArray(), 2));
		assertEquals("why%20".toCharArray(),
				URLify.urlify("why   ".toCharArray(), 1));
		assertEquals("%20lol".toCharArray(),
				URLify.urlify(" lol  ".toCharArray(), 4));
		assertEquals("%20lol".toCharArray(),
				URLify.urlify(" lol  ".toCharArray(), 4));
		assertEquals("test ".toCharArray(),
				URLify.urlify("test ".toCharArray(), 4));
		assertEquals("t%20est ".toCharArray(),
				URLify.urlify("t est   ".toCharArray(), 5));
	}
}
