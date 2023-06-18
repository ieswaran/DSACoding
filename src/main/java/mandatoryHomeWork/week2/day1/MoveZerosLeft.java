package mandatoryHomeWork.week2.day1;

import org.junit.Test;

public class MoveZerosLeft {

	@Test
	public void driverMethod() {
		int[] input = { 1, 2, 0, 3, 0, 4 };
		// output = 1,2,3,4,0,0
		moveZeroes(input);
	}

	public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        while(j<n){
            if(nums[j]!=0){
                j++;
            }
            else{
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }
        }
        for (int j2 = 0; j2 < nums.length; j2++) {
			System.out.println(nums[j2]);
		}
    }
}
