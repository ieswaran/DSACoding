package Week4.Day2;

import org.junit.Test;

public class BackspaceStringCompare {


    @Test
    void testBackspaceCompare1() {
        String s = "ab#c";
        String t = "ad#c";

        backspaceCompare(s, t);
    }

    @Test
    void testBackspaceCompare2() {
        String s = "ab##";
        String t = "c#d#";

        backspaceCompare(s, t);
    }

    @Test
    void testBackspaceCompare3() {
        String s = "a#c";
        String t = "b";

        backspaceCompare(s, t);
    }

    @Test
    void testBackspaceCompare4() {
        String s = "aav######";
        String t = "aav#####";

        backspaceCompare(s, t);
    }

    @Test
    void testBackspaceCompare5() {
        String s = "######";
        String t = "######";

        backspaceCompare(s, t);
    }

    boolean backspaceCompare(String s, String t) {
        return getActual(s).equals(getActual(t));
    }

    private String getActual(String input) {

        StringBuilder actualString = new StringBuilder();
        int hashCount = 0;

        for (int i = input.length() - 1; i >= 0; i--) {

            // Keep a count of backspace characters
            if (input.charAt(i) == '#') {
                hashCount++;
                continue;
            }

            // If backspace count > 0 reduce it and skip the character
            if (hashCount > 0) {
                hashCount--;
            } else {
                // If no backspace, just insert at beginning
                actualString.insert(0, input.charAt(i));
            }
        }

        return actualString.toString();
    }
}
