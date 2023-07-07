package mandatoryHomeWork.week6.day4;



import org.junit.Test;


/*pseudodcode :
 * 1. for take each row in a reverse order using nested for loop 
 * 	and stoer it in a new out[][] array
 * then replace each 1 with 0 and 0 with 1
 * and print hte out[][]*/
public class FlippingAnImg {
	//@Test
	public void posCase() {
		int[][] grid = { { 1, 1, 0 },
						{ 1, 0, 1 }, 
						{ 0, 0, 0 } };
		flipImg(grid);
	}
	//@Test
	public void edgeCase() {
		int[][] grid = { { 1,1,0,0},
						{ 1,0,0,1 }, 
						{ 0,1,1,1 },
						};
		flipImg(grid);
	}
	@Test
	public void negCase() {
		int[][] grid = { { 1,1,0,0},
						{ 1,0,0,1 }, 
						{ 0,2,1,1 },
						{ 0,1,1,1 }	};
		flipImg(grid);
	}

	public void flipImg(int[][] grid) {
		int rowlen = grid.length;
		int colomn = grid[0].length;	
		
		int m = 0, n = 0;
		int out[][] = new int[rowlen][colomn];
		for (int i = 0; i < rowlen; i++) {
			for (int j = colomn - 1; j >= 0; j--) {				
				out[m][n] = grid[i][j];
				n++;				
			}
			m++; n = 0;			
		}
		for (int i = 0; i < rowlen; i++) { 
			for (int j = 0; j < colomn; j++) {
				if (out[i][j] == 0) {
					out[i][j] = 1;
					System.out.print(out[i][j] + " ");
				} else if(out[i][j] == 1){
					out[i][j] = 0;
					System.out.print(out[i][j] + " ");
				}else {
					System.out.println("the input must contins only 0's and 1's");
					break;
				}
			}
			System.out.println(); 
		}
	}

}
