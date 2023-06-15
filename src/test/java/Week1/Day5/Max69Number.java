package Week1.Day5;

import org.junit.Test;

public class Max69Number {
    @Test
    public void Test(){
        int number =9669;
        int output = maximum69Number(number);
        System.out.println(output);
    }
    public int maximum69Number (int num) {
        int n = num;
        int c = 0;
        int d = 1;
        while (n>0) {
            if (n%10 == 6)
                c = 3*d;
            n = n/10;
            d = d*10;
        }
        return num + c;
    }
}
