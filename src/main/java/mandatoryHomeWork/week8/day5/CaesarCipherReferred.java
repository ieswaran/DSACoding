package mandatoryHomeWork.week8.day5;

import org.junit.Test;

public class CaesarCipherReferred {
	@Test
	public void posCase() {
		int k = 2;
		String s = "middle-Outz";
		String out = caesarCipher(s, k);
		System.out.println(out);
	}
	
	@Test
	public void negCase() {
		int k = 102;
		String s = "middle-Outz";
		String out = caesarCipher(s, k);
		System.out.println(out);
	}
	
	@Test
	public void edgeCase() {
		int k = 0;
		String s = "mIddle-Outz";
		String out = caesarCipher(s, k);
		System.out.println(out);
	}

	private String caesarCipher(String s, int k) {
		// TODO Auto-generated method stub
		//int num;
		String res = "";
		k = k % 26;
		System.out.println(k);
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) {
				char newch = (char) (ch + k);
				if (newch > 90) {
					newch = (char) (newch % 90 + 64);
				}
				res += newch;
			} else if (Character.isLowerCase(ch)) {
				char newch = (char) (ch + k);
				if (newch > 122) {
					newch = (char) (newch % 122 + 96);
				}
				res += newch;
			} else {
				res += ch;
			}
		}
		return res;

	}

}
