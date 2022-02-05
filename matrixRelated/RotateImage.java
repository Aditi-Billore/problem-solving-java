package matrixRelated;

/*
 * 48. Rotate Image
 * 
 * You are given an n x n 2D matrix representing an image, 
 * rotate the image by 90 degrees (clockwise).
 * 
 * You have to rotate the image in-place, which means you have 
 * to modify the input 2D matrix directly. DO NOT allocate another 
 * 2D matrix and do the rotation.
 * 
 */
public class RotateImage {
	
	public static void rotate(int[][] matrix) {
		for(int i =0;i< matrix.length; i++) {
			for(int j=i;j< matrix[0].length;j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		for(int i =0;i< matrix.length; i++) {
			int start = 0;
			int end = matrix[0].length - 1;
			while(start<end) {
				int temp = matrix[i][start];
				matrix[i][start] = matrix[i][end];
				matrix[i][end] = temp;
				start++;
				end--;
			}
		}
		
		for(int i =0;i< matrix.length; i++) {
			for(int j=0;j< matrix[0].length;j++) {
				System.out.print("  " + matrix[i][j]);
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}}; 
//			{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		
		rotate(matrix);
		
//		for(int i =0;i< matrix.length; i++) {
//			for(int j=0;j< matrix[0].length;j++) {
//				System.out.print("  " + matrix[i][j]);
//			}
//			System.out.println(" ");
//		}
	}
}
