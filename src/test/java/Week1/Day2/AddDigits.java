package Week1.Day2;

import org.junit.Test;

public class AddDigits {

	@Test
	public void addDigits() {

		int input = 34;
		int sum = addDigit(input);
	}

	public int addDigit(int num) {

		int sum = 0;

		while (num > 0 || sum > 9) {
			   if (num == 0) {
	                num = sum;
	                sum = 0;
	            }
	            sum=sum+ (num % 10);
	            num = num/ 10;
		}
		System.out.println(sum);
		return sum;
	}

}
