package algorithm_Lv01;

public class P_45 {
	
	public static int solution(String t, String p) {
        int answer = 0;
        
        int t_len = t.length();
        Long p_len = (long)p.length();
        
        
        /*
         * 공백 문자열을 찾기 위해서는 상위 문자열 - 하위 문자열 갯수를 빼고 1을 더해야 함.
         * 처음 시작 위치와 마지막 위치 때문에 1을 더해야 함.
         * i <= t_len - p_len 도 가능
         * p의 최대 자릿수는 18까지 가능 하지만 int형의 최대 자릿수는 -2147483648 ~ 2147483647로 10자리
         */
        for(int i=0; i<t_len - p_len + 1; i++) { 
        	if(Long.parseLong(t.substring(i, (int) (i+p_len))) <= Long.parseLong(p)) {
        		answer++;
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// 크기가 작은 부분문자열
		String t = "1221351118575141528544";
		String p = "12511";
		int ans = solution(t, p);
		System.out.println(ans);
	}

}
