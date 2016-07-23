package ch01_ArraysAndStrings.q08_ZeroMatrix;

public class ZeroMatrix {
	/**
	 * O(nm) solution that uses O(1) space
	 * 
	 * Note: should really be a void method. Using int[][] for ease of testing
	 * #badStyleSorry
	 * 
	 * 
	 * @param matrix
	 *            m by n matrix
	 * @return same m by n matrix with all elements of rows and columns that
	 *         contain zeros set to zero
	 */
	public static int[][] zeroMatrix(int[][] matrix) {
		boolean firstRowZero = false;
		boolean firstColZero = false;

		for (int j = 0; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				firstRowZero = true;
				break;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				firstColZero = true;
				break;
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		for (int j = 1; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				zeroRow(matrix, j);
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				zeroCol(matrix, i);
			}
		}
		if (firstRowZero)
			zeroRow(matrix, 0);
		if (firstColZero)
			zeroCol(matrix, 0);

		return matrix;
	}

	public static void zeroRow(int[][] matrix, int row) {
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[row][i] = 0;
		}
	}

	public static void zeroCol(int[][] matrix, int col) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}
	}

}
