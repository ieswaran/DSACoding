package Week1.Day5;

import org.junit.Test;

public class NumberMatches {

    @Test
    public void Test() {
        int teams = 7;
        System.out.println(numberOfMatches(teams));
    }

    public int numberOfMatches(int n) {
        int matches = 0;
        if (n == 1) {
            return 0;
        } else {
            while (n > 1) {
                if (n % 2 == 0) {
                    matches = matches + n / 2;
                    n = n / 2;
                } else {
                    matches = matches + (n / 2);
                    n = (n - 1) / 2 + 1;
                }
            }
            return matches;
        }
    }
}
