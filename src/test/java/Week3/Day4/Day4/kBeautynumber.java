package Week3.Day4.Day4;

import org.junit.Test;

public class kBeautynumber {
    @Test
    public void test(){
        int num = 240;
        int k=2;
      System.out.println( divisorSubstrings(num,k));
    }
    public int divisorSubstrings(int num, int k) {
        final String s = String.valueOf(num);
        int ans = 0;

        for (int i = 0; i + k <= s.length(); ++i) {
            final int x = Integer.parseInt(s.substring(i, i + k));
            if (x != 0 && num % x == 0)
                ++ans;
        }

        return ans;
    }
}
