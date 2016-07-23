package ch01_ArraysAndStrings.q07_RotateMatrix;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RotateMatrixTest {
	/**
	 * Expects both arrays to have the same dimensions.
	 * 
	 * @param a1
	 *            an n by n array
	 * @param a2
	 *            also an n by n array
	 */
	public void nxnArrayEquals(int[][] a1, int[][] a2) {
		for (int i = 0; i < a1.length; i++) {
			assertArrayEquals(a1[i], a2[i]);
		}
	}

	@Test
	public void test() {
		nxnArrayEquals(new int[][] { { 1 } },
				RotateMatrix.rotateMatrix(new int[][] { { 1 } }));
		nxnArrayEquals(new int[][] { { 2, 0 }, { 3, 1 } },
				RotateMatrix.rotateMatrix(new int[][] { { 0, 1 }, { 2, 3 } }));
		nxnArrayEquals(
				new int[][] { { 6, 3, 0 }, { 7, 4, 1 }, { 8, 5, 2 } },
				RotateMatrix.rotateMatrix(new int[][] { { 0, 1, 2 },
						{ 3, 4, 5 }, { 6, 7, 8 } }));
		nxnArrayEquals(
				new int[][] { { 12, 8, 4, 0 }, { 13, 9, 5, 1 },
						{ 14, 10, 6, 2 }, { 15, 11, 7, 3 } },
				RotateMatrix.rotateMatrix(new int[][] { { 0, 1, 2, 3 },
						{ 4, 5, 6, 7 }, { 8, 9, 10, 11 }, { 12, 13, 14, 15 } }));
	}
}
