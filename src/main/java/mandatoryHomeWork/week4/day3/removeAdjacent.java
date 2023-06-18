package mandatoryHomeWork.week4.day3;

import org.junit.Test;

public class removeAdjacent {

    @Test
    public void test(){
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }

    @Test
    public void test1(){
        String s = "azxxzy";
        System.out.println(removeDuplicates(s));
    }
    @Test
    public void test2(){
        String s = " ";
        System.out.println(removeDuplicates(s));
    }






    public String removeDuplicates(final String S) {
        StringBuilder sb = new StringBuilder();

        for (final char c : S.toCharArray()) {
            final int n = sb.length();
            if (n > 0 && sb.charAt(n - 1) == c)
                sb.deleteCharAt(n - 1);
            else
                sb.append(c);
        }

        return sb.toString();
    }
}
