package mandatoryHomeWork.week8.day4;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GameOfThrones {
	
	 @Test
	    public void posCase() {
	    	String s="aaabbbb";
	    	System.out.println(gameOfThrones(s));
	    }
	    
	    @Test
	    public void negCAse() {
	    	String s="cdefghmnopqrstuvw";
	    	System.out.println(gameOfThrones(s));
	    }

		private static String gameOfThrones(String s) {
			  int count =0;
			     HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			    for(int i=0; i<s.length();i++){
			        hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
			    }
			    System.out.println(hm);
			    for(Map.Entry<Character, Integer> entry : hm.entrySet()){
			        int key = entry.getValue();
			        if(key % 2 != 0){
			            count++;
			        }
			    } if(count <= 1){
			         return "YES";
			    }
			    return "NO";
			    }			
		}

