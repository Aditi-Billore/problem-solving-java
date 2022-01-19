package arrayRelated;

import java.util.ArrayList;

public class ValidSudoku {

	//check if row has no duplicates
	public static boolean isValidRow(char[][] board, int row) {
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i =0;i< board[0].length;i++) {
			if(list.contains(board[row][i])) {
				return false;
			}
			else if(board[row][i] != '.'){
				list.add(board[row][i]);
			}
		}		
		return true;
	}
	
	public static boolean isValidCol(char[][] board, int col) {
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i =0;i< board.length;i++) {
			if(list.contains(board[i][col])) {
				return false;
			}
			else if(board[i][col] != '.'){
				list.add(board[i][col]);
			}
		}		
		return true;
	}
	
	public static boolean isValidBox(char[][] board, int row, int col) {

		ArrayList<Character> list = new ArrayList<Character>();
		for(int i =row;i< row+3;i++) {
			for(int j=col; j< col+3; j++) {
				if(list.contains(board[i][j])) {
					return false;
				}
				else if(board[i][j] != '.'){
					list.add(board[i][j]);
				}				
			}
		}
		return true;
	}
	
	public static boolean isValid(char[][] board, int row, int col) {
		boolean resultRow = isValidRow(board, row);
		boolean resultCol = isValidCol(board, col);
		boolean resultBox = isValidBox(board, row - row %3, col-col%3);
		
		return resultRow && resultCol&& resultBox;
	}

	public static boolean isValidSudoku(char[][] board) {
		boolean result = true;
		int rows = board.length;
		int cols = board[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result = isValid(board, i, j);
				if (result == false) {
					break;
				}
			}
			if (result == false) {
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		char[][] board = {{'5','3','.','.','5','.','.','.','.'}
							,{'6','.','.','1','9','5','.','.','.'}
							,{'.','9','8','.','.','.','.','6','.'}
							,{'8','.','.','.','6','.','.','.','3'}
							,{'4','.','.','8','.','3','.','.','1'}
							,{'7','.','.','.','2','.','.','.','6'}
							,{'.','6','.','.','.','.','2','8','.'}
							,{'.','.','.','4','1','9','.','.','5'}
							,{'.','.','.','.','8','.','.','7','9'}};
		
		char[][] board1 = {{'8','3','.','.','7','.','.','.','.'}
		,{'6','.','.','1','9','5','.','.','.'}
		,{'.','9','8','.','.','.','.','6','.'}
		,{'8','.','.','.','6','.','.','.','3'}
		,{'4','.','.','8','.','3','.','.','1'}
		,{'7','.','.','.','2','.','.','.','6'}
		,{'.','6','.','.','.','.','2','8','.'}
		,{'.','.','.','4','1','9','.','.','5'}
		,{'.','.','.','.','8','.','.','7','9'}};
		
		System.out.println(isValidSudoku(board));
//		System.out.println(isValidSudoku(board1));

	}

}
