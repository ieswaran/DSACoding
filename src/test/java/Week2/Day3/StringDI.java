package LeetCodeSolutions;

import org.junit.Test;

import java.util.Arrays;

public class StringDI {

    @Test
    public void test() {
        String s = "IDID";
        System.out.println(Arrays.toString(diStringMatch(s)));
    }

    public int[] diStringMatch(String s) {
        int inc = 0, size = s.length();
        int dec = size;
        int[] outputarr = new int[size + 1];
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == 'I') {
                outputarr[i] = inc++;
            } else {
                outputarr[i] = dec--;
            }
        }
        outputarr[size] = dec;
        return outputarr;
    }
}
