package algorithm_Lv01;

public class P_18 {
	
	public String sol(String s, int n) {
		// 시저 암호
		
		// 65 ~ 90 Upper
		// 97 ~ 122 Lower
		// 알파벳은 총 26개
		
		String ans = "";
		char x;
		
		for(int i=0; i<s.length(); i++) {
			x = s.charAt(i);
			
			if(Character.isUpperCase(x)) {
				x = (char)((x - 'A' + n) % 26 + 'A');
				// char와 int의 계산을 위해 'A'를 뺏다가 더함
				// x+n이 Z를 넘어 갔을경우를 대비해 26의 나머지를 구한다. (27부터 1으로 시작)
			} else if(Character.isLowerCase(x)) {
				x = (char)((x - 'a' + n) % 26 + 'a');
			}
			
			ans += x;
			
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		P_18 p = new P_18();
		
		String s = "a B z";
		int n = 4;
		
		System.out.println(p.sol(s, n));
		
	}

}
