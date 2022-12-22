package algorithm_Lv01;

import java.util.ArrayList;
import java.util.List;

public class P_45 {
	
	public static int solution(String t, String p) {
        int answer = 0;
        
        int t_len = t.length();
        int p_len = p.length();
        List<String> list = new ArrayList<>();
        
        int cnt = 0;
        for(int i=0; i<4; i++) { // 방 크기 공식 구해야함
        	list.add(i, t.substring(cnt, cnt+p_len));
        	cnt++;
        }
        
        System.out.println(list.toString());
        
        return answer;
    }

	public static void main(String[] args) {
		// 크기가 작은 부분문자열
		String t = "10203";
		String p = "15";
		int ans = solution(t, p);
		System.out.println(ans);
	}

}
