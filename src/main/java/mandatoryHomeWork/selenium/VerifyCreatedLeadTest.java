package mandatoryHomeWork.selenium;

import org.junit.Test;

public class VerifyCreatedLeadTest {

  @Test
  public void testVerifyTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void testVerifyLoginTest() {
    throw new RuntimeException("Test not implemented");
  }


@Test
public void example() {
	// TODO Auto-generated method stub
	
        int []nums = {2,7,11,15};
        int target = 9;
        twoSum(nums, target);   
}
	
	private static void twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int sum = 0;
        for(int i=0 ; i<nums.length; i++)
            sum = nums[left] + nums[right];
            if(sum == target) {
            System.out.println("matched"+ nums[left]+" "+ nums[right]);
            
            }
            else if(sum < target)
                left++;
                else 
                right--;       
}}