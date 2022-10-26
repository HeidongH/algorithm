package algorithm_Lv01;

public class P_44 {
	
	static int ans = 0;
	
	public int solution(int a, int b, int n) {
		
		if(n < a) { 
			return ans; 
		}
		
		int minus = (n / a) * a;
        int plus = (minus / a) * b; 
        int empty = n - minus + plus;
        ans += plus;
        
        return solution(a, b, empty);
    }

	public static void main(String[] args) {
		// 콜라문제
		int a = 3;
		int b = 2;
		int n = 20;
		
		P_44 p = new P_44();
		int result = p.solution(a, b, n);
		
		System.out.println(result);
	}

}
