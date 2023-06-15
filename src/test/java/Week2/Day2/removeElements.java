package Week2.Day2;

import org.junit.Test;

public class removeElements {
    @Test
    public void Test(){
        int [] input = {0,1,2,2,3,0,4,2};
        int val =2 ;
        int output = removeElement(input,val);
        System.out.println(output);
    }
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (final int num : nums)
            if (num != val)
                nums[i++] = num;

        return i;
    }
}
