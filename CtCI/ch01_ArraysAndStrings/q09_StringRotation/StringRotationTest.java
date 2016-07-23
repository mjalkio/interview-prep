package ch01_ArraysAndStrings.q09_StringRotation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringRotationTest {
	@Test
	public void test() {
		String[][] trueInputs = { { "a", "a" }, { "", "" }, { "ab", "ab" },
				{ "waterbottle", "erbottlewat" }, { "ab", "ba" },
				{ "abc", "cab" }, { "abc", "bca" }, { "hello", "elloh" } };
		for (String[] pair : trueInputs) {
			assertTrue(pair[0] + ", " + pair[1],
					StringRotation.stringRotation(pair[0], pair[1]));
		}

		String[][] falseInputs = { { "aa", "bb" }, { "", "aa" },
				{ "abc", "cba" }, { "a", "ab" }, { "cat", "dog" } };
		for (String[] pair : falseInputs) {
			assertFalse(pair[0] + ", " + pair[1],
					StringRotation.stringRotation(pair[0], pair[1]));
		}
	}
}
