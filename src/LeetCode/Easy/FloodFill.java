package LeetCode.Easy;

public class FloodFill {
    /*An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.

Return the modified image after performing the flood fill.
Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
Output: [[2,2,2],[2,2,0],[2,0,1]]
Explanation: From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) are colored with the new color.
Note the bottom corner is not colored 2, because it is not 4-directionally connected to the starting pixel.
     */
    public static void main(String[] args) {

        int[][]  image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, newColor = 2;
        int oldColor = image[sr][sc];

        if(oldColor == newColor){
            System.out.print(image);
        }else {
            floodFillByDFS(image, sr, sc, oldColor, newColor);
            System.out.print(image);
        }
    }

    private static void floodFillByDFS(int[][] image, int row, int col, int oldColor, int newColor) {

    if(row < 0 || row > image.length || col < 0 || col < image.length || image[row][col] != oldColor){
        return;
    }
        image[row][col] = newColor;

        floodFillByDFS(image,row-1,col,oldColor,newColor); // Up
        floodFillByDFS(image,row+1,col,oldColor,newColor); // Down
        floodFillByDFS(image,row,col-1,oldColor,newColor); // Left
        floodFillByDFS(image,row,col+1,oldColor,newColor); // Right
    }

}
