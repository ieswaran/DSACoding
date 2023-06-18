package mandatoryHomeWork.week3.day3;

import org.junit.Test;

public class insertPosition {
    @Test
    public void Test(){
        int[] nums = {1,2,4,5,6};
        int target = 3;
        System.out.println(searchInsert(nums,target));

    }
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length;

        while (l < r) {
            final int m = (l + r) / 2;
            if (nums[m] == target)
                return m;
            if (nums[m] < target)
                l = m + 1;
            else
                r = m;
        }

        return l;
    }

}
