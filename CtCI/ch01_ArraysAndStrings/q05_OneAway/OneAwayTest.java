package ch01_ArraysAndStrings.q05_OneAway;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OneAwayTest {
	@Test
	public void test() {
		String[][] trueInputs = { { "a", "b" }, { "pale", "ple" },
				{ "pales", "pale" }, { "pale", "bale" }, { "a", "a" },
				{ "", "" } };
		for (String[] pair : trueInputs) {
			assertTrue(pair[0] + ", " + pair[1],
					OneAway.oneAway(pair[0], pair[1]));
		}

		String[][] falseInputs = { { "aa", "bb" }, { "", "aa" },
				{ "abc", "cba" } };
		for (String[] pair : falseInputs) {
			assertFalse(pair[0] + ", " + pair[1],
					OneAway.oneAway(pair[0], pair[1]));
		}
	}
}
