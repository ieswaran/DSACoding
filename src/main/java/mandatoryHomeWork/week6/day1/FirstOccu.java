package mandatoryHomeWork.week6.day1;

import org.junit.Test;

/* Input: haystack = "sadbutsad", needle = "sad"
 * Pseudodoe :
 * 1. take the size of the needle
 * 2. then make the haystack multiple substring with size of needle
 * 	then compare each sunstring with the needle values are matching
 * if yes return the */
public class FirstOccu {
	@Test
	public void posCase() {
		String haystack = "sudbutsad";
		String needle = "sad";
		System.out.println(firstOcc(haystack, needle));
	}
	@Test
	public void negCase() {
		String haystack = "sudbutsa";
		String needle = "sad";
		System.out.println(firstOcc(haystack, needle));
	}
	@Test
	public void edgeCase() {
		String haystack = "s";
		String needle = "sad";
		System.out.println(firstOcc(haystack, needle));
	}
	public int firstOcc(String haystack,String needle ) {
		 int haylength=haystack.length();
	        int needlelength=needle.length();
	        if(haylength<needlelength)
	            return -1;
	        for(int i=0;i<=haystack.length()-needle.length();i++){
	            int j=0;
	            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
	                j++;
	            if(j==needle.length()){
	                return i;
	            }
	        }
	        return -1;
		
	}
	

}
