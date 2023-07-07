package MetorHomeWork;

import org.junit.Test;

import java.util.Stack;

public class StringDecode {


    @Test
    public void test(){
        String  input = "3[a]2[bc]";

        System.out.println(decodeString(input));

    }
    public String decodeString(String input) {
        Stack<Integer> numbers = new Stack<Integer>();
        Stack<String> str = new Stack<String>();

        String outputStr = "";
        int num = 0;

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            if (c == '[') {
                numbers.push(num);
                str.push(outputStr);
                num = 0;
                outputStr = "";
            } else if (c == ']') {
                StringBuilder s = new StringBuilder();
                int multiply = numbers.pop();
                for (int i = 0; i < multiply; i++) {
                    s.append(outputStr);
                }
                outputStr = s.toString();
            }
           else {
               outputStr = outputStr+ c;
            }
        }

        return outputStr;

    }
}
