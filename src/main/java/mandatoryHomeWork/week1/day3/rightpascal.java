package mandatoryHomeWork.week1.day3;

import org.junit.Test;

public class rightpascal {
	
	@Test
	public void printpattern()
	{
		int n = 5;
		printPattern(n);
	}
	
	public  void printPattern(int n)
	{
		int i, j;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		for (i = n-1; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	
}

