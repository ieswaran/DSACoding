package mandatoryHomeWork.week12.day1;

import org.junit.Test;

import java.util.HashMap;

public class RomanNumbers {

    @Test
    public void Test() {

        String roman = null;

        System.out.println(romanToIntegers(roman));

    }

    public static int romanToIntegers(String roman) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        if (roman == null) {
            System.out.println("Invalid or Null Input");
            return -1;
        } else {
            for (int i = 0; i < roman.length(); i++) {
                if (i > 0 && map.get(roman.charAt(i)) > map.get(roman.charAt(i - 1))) {
                    ans += map.get(roman.charAt(i)) - (2 * map.get(roman.charAt(i - 1)));
                } else
                    ans += map.get(roman.charAt(i));

            }
        }

        return ans;

    }
}
