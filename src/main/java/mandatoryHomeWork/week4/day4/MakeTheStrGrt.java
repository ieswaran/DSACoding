package mandatoryHomeWork.week4.day4;

import java.util.Stack;
public class MakeTheStrGrt {

	public static String makeGood(String s) {
		Stack<Character> result = new Stack<Character>();
		for(char c:s.toCharArray()) {
			if(result.size()==0) {
				result.push(c);
			}
			else {
				char c1= result.peek();
				if(Character.toUpperCase(c)==Character.toUpperCase(c1)) {
					if((Character.isUpperCase(c) && Character.isLowerCase(c1)) ||(Character.isUpperCase(c1) && Character.isLowerCase(c))) {
						result.pop();
					}
					else {
						result.push(c);
					}
				}
				else {
					result.push(c);
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		while(result.size()!=0) {
			sb.append(result.pop());
		}
		return sb.reverse().toString();

	}

	public static void main(String[] args) {
		System.out.println(makeGood("leEeetcode"));
		System.out.println(makeGood("abBAcC"));
		System.out.println(makeGood("s"));

	}
}
