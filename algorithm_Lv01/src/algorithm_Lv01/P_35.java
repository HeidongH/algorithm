package algorithm_Lv01;

public class P_35 {
	
	public int solution(int n) {
		// 나머지가 1이 되는 수 찾기
		
        int answer = 0;
        for(int i=1; i<n; i++) {
            if(n % i == 1) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }

	public static void main(String[] args) {
		P_35 p = new P_35();
		
		int n = 10;
		
		System.out.println(p.solution(n));

	}

}
