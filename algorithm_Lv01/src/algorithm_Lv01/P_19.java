package algorithm_Lv01;

public class P_19 {
	
	public int sol(String s) {
		// 문자열을 정수로 바꾸기
		
		return Integer.parseInt(s);
	}
	
	
	public static void main(String[] args) {
		P_19 p = new P_19();
		
		String s = "-123254";
		
		System.out.println(p.sol(s));
	}

}
