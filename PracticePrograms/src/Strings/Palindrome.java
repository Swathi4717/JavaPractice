package Strings;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "A man, a plan, a canal: Panama";
		int i = 0;
        char k = ' ';
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		char[] res = new char[s.length()];
		char[] t = s.toCharArray();
		for(int j=t.length-1; j>=t.length/2 ; j--) {
			k = t[i];
			res[i] = t[j];
			res[j] = k;
			i++;

		}

		if(Arrays.equals(t, res)) {
			System.out.println("True");
		}
	}

}
