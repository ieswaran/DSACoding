package mandatoryHomeWork.week1.day4;

import java.util.Arrays;

import org.junit.Test;

public class MissingNum {
	
	

	
	   @Test
	   public void posCase() {
		   int[] nums= {2,0,1,4};
		   Missingumber(nums);
	   }
	   
	   @Test
	   public void negCase() {
		   int[] nums= {0,1};
		   Missingumber(nums);
	   }
	private void Missingumber(int[] nums) {
		int j=nums.length;
		int left=0,right=nums.length-1;
		while(left<right) {
			if(nums[left]==j || nums[right]==j) {
				j--;
			}
			else {
				left++;
				right--;
			}
			 }
		 System.out.println("Missing number is :"+j);
		}
	}

