package Week3.Day3;

import org.junit.Test;


import java.util.Arrays;

public class kScores {
/*Pseudo Code:
    store the difference in a variable diff;

* diff = 7-1 =6
kmindiff =6
next window 4,7,9
*diff =9-4=5
kminDiff =5
* */
@Test
    public void test1(){
  int[]  nums = {9,4,1,7};
  int k =2;
    System.out.println("Test Output 1: "+minimumDifference( nums, k));

}

    public int minimumDifference(int[] nums, int k) {
        //Input: nums = [9,4,1,7], k = 3 ==> [1,4,7,9]
        int diff ;
        int kminDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i <= nums.length - k; i++) {
            diff = nums[i + k - 1] - nums[i];
            if (diff < kminDiff) {
                kminDiff = diff;
            }
        }
 return kminDiff;
    }

}
