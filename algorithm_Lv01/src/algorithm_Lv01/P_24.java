package algorithm_Lv01;

import java.util.Arrays;

public class P_24 {
	
	public String sol(String s) {
		// 65 ~ 90 Upper 대문자
		// 97 ~ 122 Lower 소문자

		char[] x = s.toCharArray();
		
		// char로 형변환 했기 때문에 아스키 코드값 순으로 정렬
		Arrays.sort(x); 
		
		// System.out.println(x);
		
		// char 배열을 String으로, 역순 정렬을 하기위해서 StringBuilder 사용
		StringBuilder sb = new StringBuilder(new String(x));
		return sb.reverse().toString();

	}

	public static void main(String[] args) {
		// 문자열 내림차순으로 배치하기

		P_24 p = new P_24();
		String s = "Zbcdefg";

		System.out.println(p.sol(s));
	}

}
