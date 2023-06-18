package mandatoryHomeWork.week2.day5;

import org.junit.Test;

public class reverseWordsString {


    @Test
    public void Test(){

        String Sentence = "I love my Country";
       System.out.println( reverseWords(Sentence));
    }
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String str: strs){
            StringBuffer temp = new StringBuffer(str);
            sb.append(temp.reverse());
            sb.append(" ");
        }
        sb.setLength(sb.length()-1);
        return sb.toString();
    }
}
