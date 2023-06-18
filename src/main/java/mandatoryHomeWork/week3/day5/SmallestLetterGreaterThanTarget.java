package mandatoryHomeWork.week3.day5;

import org.junit.Test;

public class SmallestLetterGreaterThanTarget {

    @Test
    public void test1(){
      char[]  letters = {'c','f','j'};
      char target = 'a';
       System.out.println( nextGreatestLetter(letters,target));
    }
    public char nextGreatestLetter(char[] letters, char target) {

        for (char letter : letters) {
            if (letter > target)
                return letter;
        }

        return letters[0];
    }

}
