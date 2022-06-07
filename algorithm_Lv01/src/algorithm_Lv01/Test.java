package algorithm_Lv01;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 65 ~ 90 Upper 대문자
		// 97 ~ 122 Lower 소문자
		
		String ans = "";
		String s = "ZbcdefgA";

		char[] x = s.toCharArray();
		
		// char로 형변환 했기 때문에 아스키 코드값 순으로 정렬
		Arrays.sort(x); 
		
		// System.out.println(x);
		
		// char 배열을 String으로, 역순 정렬을 하기위해서 StringBuilder 사용
		StringBuilder sb = new StringBuilder(new String(x));
		sb.reverse().toString();
		
		// System.out.println(sb);
		
	}

}
