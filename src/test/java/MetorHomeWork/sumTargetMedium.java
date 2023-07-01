package MetorHomeWork;

import org.junit.Test;

import java.util.Arrays;

public class sumTargetMedium {

    /*Pseudo Code:
    * 1. Assign two Pointers Left = 0, right = numbers.length -1
    * 2. Start a while Loop
    * 3. move left++ when sum is less than target else move right
    * 4. return the index when the sum is found
    *
    * */

    @Test
    public void testMethod1(){

        int[] numbers ={2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(numbers,target)));

    }

    @Test
    public void testMethod2(){

        int[] numbers ={0,-1};
        int target = -1;

        System.out.println(Arrays.toString(twoSum(numbers,target)));

    }
    @Test
    public void testMethod3(){

        int[] numbers ={2,3,4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(numbers,target)));

    }

    public int[] twoSum(int[] numbers, int target) {
            int left = 0;
            int right = numbers.length - 1;

            while (numbers[left] + numbers[right] != target)
                if (numbers[left] + numbers[right] < target)
                    left++;
                else
                    right--;

            return new int[] {left + 1, right + 1};
        }
    }

