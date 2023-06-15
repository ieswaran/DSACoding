import org.junit.Test;

public class MaxAvg {
//nums = [1,12,-5,-6,50,3], k = 4
    @Test
    public void Test(){
        int[] nums = {1,12,-5,-6,50,3}; int k = 4;
      System.out.println(findMaxAverage(nums,k));
    }
    public double findMaxAverage(int[] nums, int k) {
        double maxSum = 0, n = nums.length;
        for (int i = 0; i + k  <= n; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            if (sum > maxSum)
                maxSum = sum;
        }
        double Avg = maxSum/k;

        return Avg;
    }
}
