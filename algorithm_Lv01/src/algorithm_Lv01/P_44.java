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
	
	public int other(int a, int b, int n) {
		/*
		 * a = 3
		 * b = 2
		 * n = 20
		 * ans = 36
		 */
		
		int ans = 0;
		while(n >= a) { // n이 크거나 같을동안 반복 실행
			ans += n/a*b;
			n = n%a + n/a*b;
		}
		return ans;
	}

	public static void main(String[] args) {
		// 콜라 문제
		
		int a = 3;
		int b = 2;
		int n = 20;
		
		P_44 p = new P_44();
		int result = p.solution(a, b, n);
		System.out.println(result);
		
		int result2 = p.other(a, b, n);
		System.out.println(result2);
	}

}
