package matrixRelated;

public class MaxAreaOfIsland {

	public static int maxAreaOfIsland(int[][] grid) {
		int count = 0, max = 0;
		for(int i =0; i< grid.length; i++) {
			for(int j =0;j< grid.length; j++) {
				count = 0;
				if(grid[i][j] == 1) {
					count = exploreNeighbours(grid, i, j, count);
					System.out.println(count + " with max as "+ max);
					System.out.println("index is : "+ i + " j : "+ j);
					max = Math.max(max, count);
				}
			}
		}
		
		return max;
    }
	
	public static int exploreNeighbours(int[][] grid, int row, int col, int count) {
		if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length )
			return 0;
		if(grid[row][col] == 0) {
			return 0;
		}
		//check neighbors
		grid[row][col] = 0;
		count += exploreNeighbours(grid, row + 1, col, count);
		count += exploreNeighbours(grid, row - 1, col, count);
		count += exploreNeighbours(grid, row, col + 1, count);
		count += exploreNeighbours(grid, row, col - 1, count);
		return count + 1;
	}

	public static void main(String[] args) {
		int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
						{0,0,0,0,0,0,0,1,1,1,0,0,0},
						{0,1,1,0,1,0,0,0,0,0,0,0,0},
						{0,1,0,0,1,1,0,0,1,0,1,0,0},
						{0,1,0,0,1,1,0,0,1,1,1,0,0},
						{0,0,0,0,0,0,0,0,0,0,1,0,0},
						{0,0,0,0,0,0,0,1,1,1,0,0,0},
						{0,0,0,0,0,0,0,1,1,0,0,0,0}};
		
		int[][] g = {{1,1,0,1,1},
					{1,0,0,0,0},
					{0,0,0,0,1},
					{1,1,0,1,1}};
		
		System.out.println(maxAreaOfIsland(g));
	}
}


