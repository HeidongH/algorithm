package algorithm_Lv01;

import java.util.Arrays;

public class P_18 {
	
	public String sol(String s, int n) {
		// 시저 암호
		String ans = "";
		String [] r = s.split("");
		
		char [] upper = new char[26];
		char [] lower = new char[26];
		
		int start = 0;
		for(char i='A'; i<='Z'; i++) {
			for(int j=0; j<r.length; j++) {
				if(r[j].equals(String.valueOf(i))) {
					ans += Character.toString((char) (i+1));
				} else if(r[j].equals(" ")) {
					ans += r[j];
				}
			}
			
			start++;
		}
		
		start = 0;
		for(char i='a'; i<='z'; i++) {
			lower[start] = i;
			start++;
		}
		
		System.out.println(Arrays.toString(r));
		return ans;
	}

	public static void main(String[] args) {
		P_18 p = new P_18();
		
		String s = "Z";
		int n = 0;
		
		System.out.println(p.sol(s, n));
		
	}

}
