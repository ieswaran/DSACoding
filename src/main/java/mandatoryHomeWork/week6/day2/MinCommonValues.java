package mandatoryHomeWork.week6.day2;

import org.junit.Test;

/*Input: nums1 = [1,2,3], nums2 = [2,4]
 * Pseudocode :
 * 1. using two pointer L = 0 of the nums1 and R=0 of the nums2
 * check if the L < R then L++
 * check if L = R return the value of L
 * else if L > R  retun -1 */
public class MinCommonValues {
	@Test
	public void posCase() {
		int [] nums1 = {1,2,3};
		int [] nums2 = {2,3};
		System.out.println(minOcc(nums1, nums2));
	}
	@Test
	public void negCase() {
		int [] nums1 = {1,4,5};
		int [] nums2 = {2,5};
		System.out.println(minOcc(nums1, nums2));
	}
	
	@Test
	public void edgeCase() {
		int [] nums1 = {1,2,3};
		int [] nums2 = {5,6};
		System.out.println(minOcc(nums1, nums2));
	}
	
	public int minOcc(int[] num1, int[] num2) {
		
		int L= 0, R=0,count =0;
		while (L < num1.length && R < num2.length) {
			if(num1[L] == num2[R]) {
				count++;	
				return num1[L];
							
			}else if(num1[L] < num2[R] && L < num1.length && R < num2.length) {
				L++;
			}else if(num1[L] > num2[R]&& L < num1.length && R < num2.length) {
				R++;
			}
			else return -1;
		}
		if(count != 0) {
			return num1[L];
		}else
		return -1;		
	}

}
