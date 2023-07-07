package mandatoryHomeWork.week11.day2;

import java.util.HashMap;

import org.junit.Test;

public class SherlockAndValidStr {
	@Test
	public void posCase() {
		String str = "aabbcd";
		System.out.println(isValid(str));
	}
	@Test
	public void negCase() {
		String str = "xxxaabbccrry";
		System.out.println(isValid(str));		
	}
	@Test
	public void edgeCase() {
		String str = "aabbccddeefghi";
		System.out.println(isValid(str));
		
	}
	public static String isValid(String s) {
	    // Write your code here
	    int notContainsCount =0, ContainsCount =0,find =0,diff=0,count=0;
	    HashMap <Character,Integer> hm = new HashMap<Character,Integer>();
	    for(int i=0; i<s.length(); i++){
	        if(hm.containsKey(s.charAt(i))){
	            ContainsCount++;            
	            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);            
	        }else if(!hm.containsKey(s.charAt(i))){
	           notContainsCount++;
	           hm.put(s.charAt(i), 0);
	        }
	    }System.out.println("notContainsCount  :" +notContainsCount);
	    System.out.println("ContainsCount  :" +ContainsCount);
	    
	    diff = notContainsCount - ContainsCount;
	     System.out.println("diff  :" +diff);
	    
	    if(diff < 0 || diff >= 2 || diff == 0){
	        return "NO";
	    }
	  else {
	    find = notContainsCount + ContainsCount -1;
	    System.out.println("find  :" +find);
	    if(find == s.length()-1){
	        return "YES";
	    }else return "NO";

	    }
	    }

	}


