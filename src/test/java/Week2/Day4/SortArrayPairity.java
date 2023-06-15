package pairCoding;

import org.junit.Test;

import java.util.Arrays;

public class SortArrayPairity {

   /* Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

    Return any array that satisfies this condition.
*/
    /*
           1. i = 0, j =1;
           if(nums[i]%2==0 || nums[i]%2==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
           }
           else{
                j++
           }


     */


    @Test
    public void Test() {
        int[] nums = {3, 1, 2, 4};
        System.out.println("Test output 1: "+Arrays.toString(sortArrayByParity(nums)));

    }


    @Test
    public void Test2() {
        int[] nums = {1, 2, 3, 4, 5, 6, 8};
        System.out.println("Test output 2: "+Arrays.toString(sortArrayByParity(nums)));

    }

    @Test
    public void Test3() {
        int[] nums = {1,3,5,7,9};
        System.out.println("Test output 3: "+Arrays.toString(sortArrayByParity(nums)));

    }

    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = 1;

        while (j < nums.length) {
            if (nums[i] % 2 == 0 || nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return nums;
    }
}
