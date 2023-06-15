package pairCoding;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minimumAbsoluteDifference {

    /*
    Input: arr = [4,2,1,3]
    Output: [[1,2],[2,3],[3,4]]
    Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.

    1. Sort the Array
    2. Create a 2 D List for output
    3. take two pointers, with i =0, j= 1;
    4. for( i =0; j<arr.length; i++){
         diff = arr[j]-arr[i]
         if (diff<minDiff){
         minDiff = diff;
         ans.add(arr[i],arr[j])
         }
         else
         Sysout(No minimum Diff available)

         return ans
         }
         Time and Space Complexity
     */

 /*   @Test
    public void test() {
        int[] arr = {4, 2, 1, 3};
        System.out.println(minimumAbsDifference(arr));
    }
*/
    @Test
    public void test2() {
        int[] arr = {-10,-11,12,24,34};
        System.out.println(minimumAbsDifference(arr));
    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();

        int minDiff = Integer.MAX_VALUE;

        Arrays.sort(arr);
        int i = 0, j = 1;

        for (int k = arr.length - 1; k > 0; k--) {
            if (arr[k] - arr[k - 1] < minDiff) {
                minDiff = arr[k] - arr[k - 1];
            }
        }
        while (j < arr.length) {
            if (minDiff == arr[j] - arr[i]) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[j]);
                System.out.println(pair);
                ans.add(pair);

            }
            i++;
            j++;
        }

        return ans;
    }

}
