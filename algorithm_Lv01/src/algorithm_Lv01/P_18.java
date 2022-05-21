package algorithm_Lv01;

import java.util.Arrays;

public class P_18 {
	
	public String sol(String s, int n) {
		// 시저 암호
		String ans = "";
		String [] r = s.split("");
		
		// 65 ~ 90 Upper
		// 97 ~ 122 Lower
		
		char x = 65;
		int start = 0;
		while(x <= 122) {
			if(start >= r.length) break;
			
			if(r[start].equals(Character.toString(x))) {
				/*if(r[start].equals("Z")) ans += "A";
				else if(x == 122) ans += 97;*/
				ans += Character.toString((char) (x+n));
				start++;
				continue;
			} else if(r[start].equals(" ")) {
				ans += r[start]; 
				start++;
				continue;
			}
			
			x++;
			
		}
		
		System.out.println(Arrays.toString(r));
		return ans;
	}

	public static void main(String[] args) {
		P_18 p = new P_18();
		
		String s = "AB C d z Z";
		int n = 1;
		
		System.out.println(p.sol(s, n));
		
	}

}
