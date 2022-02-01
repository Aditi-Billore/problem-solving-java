package arrayRelated;

import java.util.ArrayList;
import java.util.List;

public class ReshapeMatrix {

	public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        int maxInt = row*col;
        if(maxInt != r*c) {
        	return mat;
        }
        else {
        	int[][] newMat = new int[r][c];
        	List<Integer> list1 = new ArrayList<Integer>();
        	
        	for(int i =0;i< row;i++) {
        		for(int j =0;j< col;j++) {
        			list1.add(mat[i][j]);
        		}
        	}
        	int count = 0;
        	for(int i =0;i< r;i++) {
        		for(int j =0;j< c;j++) {
        			newMat[i][j] = list1.get(count++);
        		}
        	}      	
        	       	
        	return newMat;
        }
        
        
    }
	public static void main(String[] args) {
		
		int[][] mat = {{1,2},{3,4}};

		int[][] newMat = matrixReshape(mat, 1, 4);
		for(int i=0;i<newMat.length;i++) {
			for(int j = 0;j< newMat[0].length;j++) {
				System.out.print(newMat[i][j]);
				System.out.print("   ");
			}
			System.out.println("");
		}
	}

}
