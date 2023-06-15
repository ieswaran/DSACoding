package Week3.Day1;

import org.junit.Test;

public class GoodSubstring {

    @Test
    public void Test(){
    String Input  = "xyzzaz";
    System.out.println(countGoodSubstrings(Input));
    }
    @Test
    public void Test2(){
        String Input  = "aababcabc";
        System.out.println(countGoodSubstrings(Input));
    }

    public int countGoodSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);
            if (a != b && b != c && a != c) {
                count++;
            }
        }
        return count;
    }
}
