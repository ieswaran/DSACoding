package mandatoryHomeWork.week9.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class SparseArrays {
	@Test
	public void posCase() {
		List<String> stringList = Arrays.asList(new String[]{"aba","baba","aba","xzxb"});
		List<String> queries = Arrays.asList(new String[]{"aba","xzxb","ab"});
		System.out.println(matchingStrings(stringList, queries));
	}
	@Test
	public void negCase() {
		List<String> stringList = Arrays.asList(new String[]{"def","dea","fghr"});
		List<String> queries = Arrays.asList(new String[]{"de","lmn","fgh"});
		System.out.println(matchingStrings(stringList, queries));
	}
	public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {        
	      List<Integer> out=new ArrayList<Integer>();
	        HashMap<String , Integer> hm = new HashMap<String , Integer>();
	        for(int i= 0; i<stringList.size(); i++){
	            hm.put(stringList.get(i), hm.getOrDefault(stringList.get(i),0)+1);
	        }System.out.println(hm);	        
	         for(int k= 0; k<queries.size(); k++){
	            if(hm.containsKey(queries.get(k))){
	                out.add(hm.get(queries.get(k)));
	            }   else   out.add(0);	            
	         }return out;
	    }
}
