package ch01_ArraysAndStrings.q08_ZeroMatrix;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ZeroMatrixTest {
	/**
	 * Expects both arrays to have the same dimensions.
	 * 
	 * @param a1
	 *            an m by n array
	 * @param a2
	 *            also an m by n array
	 */
	public void mxnArrayEquals(int[][] a1, int[][] a2) {
		for (int i = 0; i < a1.length; i++) {
			assertArrayEquals(a1[i], a2[i]);
		}
	}

	@Test
	public void test() {
		mxnArrayEquals(new int[][] { { 1 } },
				ZeroMatrix.zeroMatrix(new int[][] { { 1 } }));
		mxnArrayEquals(new int[][] { { 0, 0 }, { 0, 3 } },
				ZeroMatrix.zeroMatrix(new int[][] { { 0, 1 }, { 2, 3 } }));
		mxnArrayEquals(
				new int[][] { { 0, 0, 0 }, { 0, 4, 5 }, { 0, 7, 8 } },
				ZeroMatrix.zeroMatrix(new int[][] { { 0, 1, 2 }, { 3, 4, 5 },
						{ 6, 7, 8 } }));
		mxnArrayEquals(
				new int[][] { { 0, 0, 0, 0 }, { 0, 5, 6, 7 }, { 0, 9, 10, 11 },
						{ 0, 13, 14, 15 } },
				ZeroMatrix.zeroMatrix(new int[][] { { 0, 1, 2, 3 },
						{ 4, 5, 6, 7 }, { 8, 9, 10, 11 }, { 12, 13, 14, 15 } }));
		mxnArrayEquals(
				new int[][] { { 1, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } },
				ZeroMatrix.zeroMatrix(new int[][] { { 1, 1, 2 }, { 3, 4, 5 },
						{ 6, 7, 8 } }));
		mxnArrayEquals(
				new int[][] { { 1, 0, 2 }, { 0, 0, 0 }, { 6, 0, 8 } },
				ZeroMatrix.zeroMatrix(new int[][] { { 1, 1, 2 }, { 3, 0, 5 },
						{ 6, 7, 8 } }));
		mxnArrayEquals(
				new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } },
				ZeroMatrix.zeroMatrix(new int[][] { { 0, 1, 2 }, { 3, 0, 5 },
						{ 6, 7, 0 } }));

	}
}
