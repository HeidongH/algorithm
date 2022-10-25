package algorithm_Lv01;

public class P_44 {
	
	static int ans = 0;
	
	public int solution(int a, int b, int n) {
		
		if(n < a) { // 빈병이 교환할 만큼 없음
			return ans; 
		}
		
        int plus = n / a; // 6병의 콜라
        int minus = plus * a;
        int answer = n - minus + plus;
        ans += plus;
        
        return solution(a, b, answer);
    }

	public static void main(String[] args) {
		// 콜라문제
		int a = 3;
		int b = 1;
		int n = 20;
		
		P_44 p = new P_44();
		int result = p.solution(a, b, n);
		
		System.out.println(result);
	}

}
