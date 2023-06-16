package Week8.Day3;

import org.junit.Test;

public class FirstOccurrence {

    /*Psuedo Code:
     * Finding if SubString is there or not
     * Window Size = needle.length();
     * for(int i =0 ; i<HayStack.length()-needle.length()+1;i++)
     * if(needle.equals(haystack.subs(i,needle.length()))
     *   return i;
     * return-1;
     *
     *
     * }
     *
     * */

    @Test
    public void Test1() {
        String haystack = "leetcode", needle = "leetto";
        System.out.println("output 1 : " + strStr(haystack, needle));
    }

    @Test
    public void Test2() {
        String haystack = " ", needle = " ";
        System.out.println("output 2 : " + strStr(haystack, needle));
    }

    @Test
    public void Test3() {
        String haystack = "leetcode", needle = "eetc";
        System.out.println("output 3 : " + strStr(haystack, needle));
    }

    @Test
    public void Test4() {
        String haystack = "osadosad", needle = "sad";
        System.out.println("output 4 : " + strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        int hLength = haystack.length(), nLength = needle.length();
        for (int i = 0; i < hLength - nLength + 1; i++) {
            if (needle.equals(haystack.substring(i, i + nLength)))
                return i;
        }
        return -1;
    }
}
