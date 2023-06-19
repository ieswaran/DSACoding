package mandatoryHomeWork.week1.day4;

import org.junit.Test;

public class SandGlassPattern {
	@Test
	public void posCase () {
		int rows = 5;
		sandglassPattern(rows);
}

	public static void sandglassPattern(int rows) {

		for (int i = 0; i < rows; i++) {

			//To print spaces
			for (int j = 0; j < i; j++) {

				System.out.print(" ");
			}
			//To print stars
			for (int k = i; k < rows; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = rows-1; i >= 0; i--) {

			for (int j = 0; j < i; j++) {

				System.out.print(" ");
			}
			for (int k = i; k < rows; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
