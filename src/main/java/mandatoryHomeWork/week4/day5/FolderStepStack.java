package mandatoryHomeWork.week4.day5;

import java.util.Stack;

public class FolderStepStack {

    public static void main(String[] args) {
        String[] logs = {"d1/", "d2/", "../", "d21/", "./"};
        String[] logs2 = {"d1/", "d2/", "./", "d3/", "../", "d31/"};
        String[] logs3 = {"d1/", "../", "../", "../"};
        String[] logs4 = {"./", "../", "./"};

		System.out.println("Logs 1 : "+minOperations(logs));
		System.out.println("Logs 1 : "+minOperations(logs2));
		System.out.println("Logs 1 : "+minOperations(logs3));
		System.out.println("Logs 1 : "+minOperations(logs4));

    }

    public static int minOperations(String[] logs) {
        int ans = 0;

        for (final String log : logs) {
            if (log.equals("./"))
                continue;
            if (log.equals("../"))
                ans = Math.max(0, ans - 1);
            else
                ++ans;
        }

        return ans;
    }
}



