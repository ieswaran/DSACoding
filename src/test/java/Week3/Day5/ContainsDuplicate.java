package Week3.Day5;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    @Test
    public void test() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; ++i) {
            if (!seen.add(nums[i]))
                return true;
            if (i >= k)
                seen.remove(nums[i - k]);
      k= Math.abs(k) ; }

        return false;
    }
}
