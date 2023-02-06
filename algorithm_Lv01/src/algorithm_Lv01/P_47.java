package algorithm_Lv01;

import java.util.Arrays;

public class P_47 {
	
	public int solution(String s, String skip, int index) {
        int answer = 0;
        
        char[] alphabet = new char[26];
        
        int cnt = 0;
        for(int i=97; i<=122; i++) {
            alphabet[cnt] = (char)(i);
            cnt++;
        }
        
        System.out.println(Arrays.toString(alphabet));
        
        return answer;
    }

	public static void main(String[] args) {
		// 둘만의 암호
		
		P_47 p = new P_47();
		String s = "aukks";
		String skip = "wbqd";
		int index = 5;
		
		System.out.println(p.solution(s, skip, index));

	}

}
