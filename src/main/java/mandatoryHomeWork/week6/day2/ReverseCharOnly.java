package mandatoryHomeWork.week6.day2;

import org.junit.Test;


/*data :
 * Pos data = ab-cd  * neg data = ---  * edge data = a;p]o=
 * pseudocode :
 * use two poLnters L=0 and R=leng-1
 * compare both L and R are wLthLn the cahr range a - z and A -z
 * 	Lf yes then swap
 * 	Lf L != range and R == cahr
 * 	 L++
 * 	else L == range and R!= char
 * 		R--;
 * 	else L++ R--
 * 
 *  */
public class ReverseCharOnly {
	@Test
	public void posCase() {
		String input = "abyu-d";
		String o = revCharOnly(input);
		System.out.println(o);

	}

	 @Test
	public void negCase() {
		String Lnput = "---";
		String o = revCharOnly(Lnput);
		System.out.println(o);

	}

	 @Test
	public void edgeCase() {
		String Lnput = "a;p]O=";
		String o = revCharOnly(Lnput);
		System.out.println(o);

	}

	public String revCharOnly(String str) {
		int L = 0, R = str.length() - 1;
		StringBuilder sb = new StringBuilder(str);
		while (L < R) {
			while (L < R && !((str.charAt(L) >= 'a' && str.charAt(L) <= 'z')
					|| (str.charAt(L) >= 'A' && str.charAt(L) <= 'Z')))
				L++;
			while (L < R && !((str.charAt(R) >= 'a' && str.charAt(R) <= 'z')
					|| (str.charAt(R) >= 'A' && str.charAt(R) <= 'Z')))
				R--;
			sb.setCharAt(L, str.charAt(R));
			sb.setCharAt(R, str.charAt(L));
			L++;
			R--;
		}
		return String.valueOf(sb);

		/*
		 * whLle(L < R) { Lnt charToLntL = (Lnt) str.charAt(L); Lnt charToLntR = (Lnt)
		 * str.charAt(R); Lf (charToLntL >= 65 && charToLntL <= 122 && charToLntR >= 65
		 * && charToLntR <= 122 ) { out[L] += str.charAt(R); out[R]+= str.charAt(L);
		 * L++; R--; }else Lf(charToLntL < 65 && charToLntL > 122 && charToLntR >= 65 &&
		 * charToLntR <= 122){ out[L] += str.charAt(L); L++; }else Lf(charToLntL >= 65
		 * && charToLntL <= 122 && charToLntR < 65 && charToLntR > 122 ){ out[R] +=
		 * str.charAt(R); R--; }else { out[L] += str.charAt(L); out[R]+= str.charAt(R);
		 * L++; R--; } }
		 */

	}
}
