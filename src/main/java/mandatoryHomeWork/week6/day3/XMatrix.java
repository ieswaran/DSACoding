package mandatoryHomeWork.week6.day3;

import org.junit.Test;

/* pseudocode :
 * 1. make a outer for loop to hold the matrix value
 * 	use inner loop to move to the first row of the matrix (0,0) (0,1) (0,2) etc..
 * 2. inside the inner loop 
 * 	if(i==j || i+j < m.len-1 ){
 * 	then mat[i][j] == 0
 * return false;
 * }else mat[i][j] !=0 * 		
 * return false * 
 * return true
 * */
public class XMatrix {
	//@Test
	public void posCase() {
		int[][] grid = { { 2, 0, 0, 1 }, { 0, 3, 1, 0 }, { 0, 5, 2, 0 }, { 4, 0, 0, 2 } };
		System.out.println(xMatrix(grid));
	}
	//@Test
	public void negCase() {
		int[][] grid = { { 5,7,4 }, 
						 { 0,3,0}, 
						 { 2,0,7 } };
		System.out.println(xMatrix(grid));
	}
	
	@Test
	public void edgeCase() {
		int[][] grid = { { 5,-7,4 }, 
						 { 0,3,0}, 
						 { 2,0,7 } };
		System.out.println(xMatrix(grid));
	}

	public boolean xMatrix(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (i == j || i + j == grid.length - 1) {
					if(grid[i][j] == 0)
					return false;
				} else {
					if (grid[i][j] != 0) 
						return false;
				}
			}
		}
		return true;
	}
}
