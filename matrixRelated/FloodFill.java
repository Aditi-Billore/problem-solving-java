package matrixRelated;

public class FloodFill {

	public static boolean isValid(int[][] image, int sr, int sc, int startColor) {

		return (sr >= 0 && sr<image.length) &&(sc>=0 && sc<image[0].length) && image[sr][sc] == startColor;
	}

	public static int[][] floodFillHelper(int[][] image, int sr, int sc, int newColor, int startColor) {

		// check for four directionally connectedness
		image[sr][sc] = newColor;
			
		if (isValid(image, sr - 1, sc, startColor)) {
			image = floodFillHelper(image, sr - 1, sc, newColor, startColor);
		}
		if (isValid(image, sr, sc - 1, startColor)) {
			image = floodFillHelper(image, sr, sc - 1, newColor, startColor);
		}
		if (isValid(image, sr + 1, sc, startColor)) {
			image = floodFillHelper(image, sr + 1, sc, newColor, startColor);
		}
		if (isValid(image, sr, sc + 1, startColor)) {
			image = floodFillHelper(image, sr, sc + 1, newColor, startColor);
		}

		return image;
	}

	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		//return image if color is already filled
		if(image[sr][sc]==newColor) return image;
		// check for four directionally connectedness
		int startingColor = image[sr][sc];
		image = floodFillHelper(image, sr, sc, newColor, startingColor);

		return image;
	}

	public static void main(String[] args) {

		int[][] image = { { 0, 0, 0 }, { 0, 1, 1 } };
		int sr = 1;
		int sc = 1;
		int newColor = 1;
		int[][] res = floodFill(image, sr, sc, newColor);

		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				System.out.print(res[i][j] + "  ");
			}
			System.out.println(" ");
		}
	}

}
