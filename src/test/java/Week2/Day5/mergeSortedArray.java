package LeetCodeSolutions;

import org.junit.Test;

import java.util.Arrays;

public class mergeSortedArray {
    @Test
    public void Test(){
        int[] nums1 = {1,3,5};
        int[] nums2 = {2,4,6};
        int n = nums2.length;
        int m = nums1.length;
   merge( nums1,  m,  nums2, n);
    System.out.println(Arrays.toString(merge( nums1,  m,  nums2, n)));
    }
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        int[] nums3 = new int[m+n];
        while (j >= 0)
            if (i >= 0 && nums1[i] > nums2[j])
                nums3[k--] = nums1[i--];
            else
                nums3[k--] = nums2[j--];
return nums3;
    }
}
