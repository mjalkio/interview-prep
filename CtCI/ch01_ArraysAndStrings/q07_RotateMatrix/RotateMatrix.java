package ch01_ArraysAndStrings.q07_RotateMatrix;

public class RotateMatrix {
	/**
	 * O(n^2) solution that uses O(1) space.
	 * 
	 * Note: should really be a void method. Using int[][] for ease of testing
	 * #badStyleSorry
	 * 
	 * @param matrix
	 *            an n by n matrix
	 * @return the same matrix rotated 90 degrees
	 */
	public static int[][] rotateMatrix(int[][] matrix) {
		for (int layer = 0; layer < matrix.length / 2; layer++) {
			int last = matrix.length - 1 - layer;
			for (int i = layer; i < last; i++) {
				int offset = i - layer;
				int temp = matrix[layer][i];
				matrix[layer][i] = matrix[last - offset][layer];
				matrix[last - offset][layer] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[i][last];
				matrix[i][last] = temp;
			}
		}
		return matrix;
	}
}
