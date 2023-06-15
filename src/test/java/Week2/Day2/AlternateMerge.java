package Week2.Day2;

import org.junit.Test;

public class AlternateMerge {

	@Test
	public void driverMethod() {

		String s1 = "abc", s2 = "pqrSE";

		alternateMerge(s1, s2);

		// apbqcr
	}

	private void alternateMerge(String s1, String s2) {
		// TODO Auto-generated method stub
		String s = "";

		for (int k = 0; k < s1.length() || k < s2.length(); k++) {
			if (k < s1.length()) {
				s += s1.charAt(k);

			}
			if (k < s2.length()) {
				s += s2.charAt(k);
			}

		}
		System.out.println(s);

	}
}
