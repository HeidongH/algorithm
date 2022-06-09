package algorithm_Lv01;

import java.util.Arrays;

public class P_25 {
	
	public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for(int i=0; i<strings.length; i++) { 
        	answer[i] = String.valueOf(strings[i].charAt(n)) + strings[i];
        }
        
        Arrays.sort(answer);
        
        for(int i = 0; i<strings.length; i++) {
        	answer[i] = answer[i].substring(1, answer[i].length());
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// 문자열 내 마음대로 정렬하기
		P_25 p = new P_25();
		String [] x = {"abce", "abcd", "cdx"};
		int n = 2;
		
		System.out.println(Arrays.toString(p.solution(x, n)));
		
	}

}
