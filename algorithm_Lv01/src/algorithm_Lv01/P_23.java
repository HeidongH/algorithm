package algorithm_Lv01;

public class P_23 {
	
	public boolean sol(String s) {
		boolean ans = true;

		if(s.length() != 4 && s.length() != 6) return false;

		System.out.println(s.length());
		
		try {
			Integer.parseInt(s);
			ans = true;
		} catch (Exception e) {
			ans = false;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// 문자열 다루기 기본
		
		P_23 p = new P_23();
		String s = "123344";

		System.out.println(p.sol(s));

	}

}
