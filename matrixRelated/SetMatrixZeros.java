package matrixRelated;

import java.util.ArrayList;
import java.util.List;


/*
 * 
 * 73. Set Matrix Zeroes
 * 
 * Given an m x n integer matrix matrix, if an element is 0, 
 * set its entire row and column to 0's, and return the matrix.
 * 
 * You must do it in place.
 */

public class SetMatrixZeros {
	public static void updateMatrix(int row, int col, int[][] matrix) {
		// update column
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}

		// update row
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[row][i] = 0;
		}
	}

	public static void setZeroes(int[][] matrix) {
		List<List<Integer>> zeros = new ArrayList<List<Integer>>();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					List<Integer> indices = new ArrayList<Integer>();
					indices.add(i);
					indices.add(j);
					zeros.add(indices);
				}
			}
		}

		for (int i = 0; i < zeros.size(); i++) {
			List<Integer> indices = zeros.get(i);
			updateMatrix(indices.get(0), indices.get(1), matrix);
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZeroes(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
