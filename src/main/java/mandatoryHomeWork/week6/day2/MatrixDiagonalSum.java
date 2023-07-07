package mandatoryHomeWork.week6.day2;

import org.junit.Test;



/*pseudocode : O(n^2)
 * 1. make a outer for loop to hold the matrix value
 * 	use inner loop to move to the first row of the matrix (0,0) (0,1) (0,2) etc..
 * 2. inside the inner loop 
 * 	if(i==j || i+j < m.len-1)
 * 		then take and add those value to sum
 * and print the sum */
public class MatrixDiagonalSum {
	//@Test
	public void posCase() {
		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(matrixDia(mat));
	}
	//@Test
	public void negCase() {
		int mat[][] = { { 0, 2, -3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(matrixDia(mat));
	}
	@Test
	public void edgeCase() {
		int mat[][] = { { 1, 1, 1 ,1}, { 1, 1, 1 ,1},{ 1, 1, 1 ,1},{ 1, 1, 1 ,1} };
		System.out.println(matrixDia(mat));
	}

	public int matrixDia(int mat[][]) {
		int sum = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (i == j || i + j == mat.length-1) {
					sum += mat[i][j];
				}
			}
		}
		return sum;
	}
}
