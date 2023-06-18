package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class PLusOne {

	@Test
	public void plusOnes() {
		int[] digit = { 9 };
		int[] output = plusOne(digit);
		System.out.println(Arrays.toString(output));

	}

	public int[] plusOne(int[] digit) {

		for (int i = digit.length - 1; i >= 0; i--) {
			if (digit[i] < 9) {
				digit[i] = digit[i] + 1;
				return digit;
			} else {
				digit[i] = 0;
				if (i == 0) {
					digit = new int[digit.length + 1];
					digit[0] = 1;
				}
			}
		}

		return digit;
	}

}
