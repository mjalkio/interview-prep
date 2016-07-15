package ch01_ArraysAndStrings.q01_IsUnique;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsUniqueTest {

	@Test
	public void testIsUnique() {
		String[] areUnique = { "abc", "", "012345689" };
		for (String s : areUnique) {
			assertTrue(s, InPlaceIsUnique.isUnique(s));
			assertTrue(s, SetIsUnique.isUnique(s));
		}

		String[] notUnique = { "aaa", "apple", "01234567899" };
		for (String s : notUnique) {
			assertFalse(s, InPlaceIsUnique.isUnique(s));
			assertFalse(s, SetIsUnique.isUnique(s));
		}
	}
}
