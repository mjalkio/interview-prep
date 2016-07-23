package ch01_ArraysAndStrings.q06_StringCompression;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCompressionTest {
	@Test
	public void test() {
		assertEquals("a2b1c5a3",
				StringCompression.stringCompression("aabcccccaaa"));
		assertEquals("abc", StringCompression.stringCompression("abc"));
		assertEquals("aac", StringCompression.stringCompression("aac"));
		assertEquals("a", StringCompression.stringCompression("a"));
		assertEquals("", StringCompression.stringCompression(""));
		assertEquals("a3", StringCompression.stringCompression("aaa"));
		assertEquals("a10", StringCompression.stringCompression("aaaaaaaaaa"));
		assertEquals("A2B2b2", StringCompression.stringCompression("AABBbb"));

	}
}
