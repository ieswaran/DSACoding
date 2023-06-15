package Week2.Day2;

import org.junit.Test;

public class MaximumProduct {

    @Test
    public void Test() {
        int[] nums = {3, 4, 5, 3};

        System.out.println(maxProduct(nums));

    }

    @Test
    public void Test1() {
        int[] nums = {3, 4};

        System.out.println(maxProduct(nums));

    }


    public int maxProduct(int[] nums) {
        int a = 0;
        int b = 0;
        for (int num : nums) {
            if (num > a) {
                a = num;
            }
            if (a > b) {
                int ret = a;
                a = b;
                b = ret;
            }
        }
        return (a - 1) * (b - 1);
    }

}
