package algorithm_Lv01;

import java.util.Arrays;

public class P_18 {
	
	public String sol(String s, int n) {
		// 시저 암호
		String ans = "";
		char [] r = s.toCharArray();
		
		// 65 ~ 90 Upper
		// 97 ~ 122 Lower
		// 알파벳은 총 26개
		
		char x;

		for(int i=0; i<r.length; i++) {
			if(Character.isUpperCase(r[i])) {
				x = (char)(r[i]);
				x = (x == 'Z') ? (x = (char)('A' + (n-1))) : (char)(x+n); 
				ans += String.valueOf(x);
				continue;
			} else if(Character.isLowerCase(r[i])) {
				x = (char)(r[i]);
				x = (x == 'z') ? (x = (char)('a' + (n-1))) : (char)(x+n);
				ans += String.valueOf(x);
				continue;
			}
			
			ans += r[i];
			
		}
		
		System.out.println(Arrays.toString(r));
		return ans;
	}

	public static void main(String[] args) {
		P_18 p = new P_18();
		
		String s = "a B z";
		int n = 4;
		
		System.out.println(p.sol(s, n));
		
	}

}
