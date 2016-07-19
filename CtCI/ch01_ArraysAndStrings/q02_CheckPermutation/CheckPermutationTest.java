package ch01_ArraysAndStrings.q02_CheckPermutation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckPermutationTest {

	@Test
	public void test() {
		String[][] arePermutations = { { "a", "a" }, { "ab", "ba" },
				{ "miracle", "claimer" }, { "", "" } };
		for (String[] pair : arePermutations) {
			assertTrue(pair[0] + ", " + pair[1],
					AsciiCheckPermutation.checkPermutation(pair[0], pair[1]));
			assertTrue(pair[0] + ", " + pair[1],
					MapCheckPermutation.checkPermutation(pair[0], pair[1]));
			assertTrue(pair[0] + ", " + pair[1],
					SortCheckPermutation.checkPermutation(pair[0], pair[1]));
		}

		String[][] notPermutations = { { "ab", "ac" },
				{ "miracle", "Claimer" }, { "A", "a" }, { "dog", "cat" } };
		for (String[] pair : notPermutations) {
			assertFalse(pair[0] + ", " + pair[1],
					AsciiCheckPermutation.checkPermutation(pair[0], pair[1]));
			assertFalse(pair[0] + ", " + pair[1],
					MapCheckPermutation.checkPermutation(pair[0], pair[1]));
			assertFalse(pair[0] + ", " + pair[1],
					SortCheckPermutation.checkPermutation(pair[0], pair[1]));
		}
	}

}
