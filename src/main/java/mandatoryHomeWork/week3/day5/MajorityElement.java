package mandatoryHomeWork.week3.day5;

import org.junit.Test;

public class MajorityElement {
    @Test
    void testMajorityElement1() {
        int[] num = {3, 3, 2};
        majorityElement(num);
    }

    @Test
    void testMajorityElement2() {
        int[] num = {2, 2, 1, 3, 1, 2, 2};
        majorityElement(num);

    }
   public int majorityElement(int[] num) {

        int majority = num[0], votes = 1;

        for (int i = 1; i < num.length; i++) {

            if (votes == 0) {
                votes++;
                majority = num[i];
            } else if (majority == num[i]) {
                votes++;
            } else
                votes--;

        }
        return majority;
    }
}
