package Week2.Day1;

import org.junit.Test;

import java.util.Arrays;

public class removeDuplicates {
        @Test
        public void test(){
            int[] arr = {1,2,2,3,4};
           int output = removeDuplicates(arr);
            System.out.println(output);
        }
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return Arrays.copyOf(nums, i + 1).length;
    }
}
