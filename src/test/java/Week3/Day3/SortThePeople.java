package Week3.Day3;

import org.junit.Test;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class SortThePeople {
    @Test
    public void Test(){

     String[]   names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
     System.out.println(sortPeople(names,heights));
    }
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> pair = new TreeMap<Integer,String>();
        for (int i =heights.length-1; i>0;i--){
            pair.put(heights[i], names[i]);
        }
        Map<Integer,String>  pair1 = new TreeMap<Integer,String>(Collections.reverseOrder());
        pair1.putAll(pair);
            String[] out = pair1.values().toArray(new String[0]);
        return out;
    }
}
