package algorithm_Lv01;

public class P_17 {
	
	public int sol(int n) {
		// 약수의 합
		
		int ans = 0;
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				ans += i;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		P_17 p = new P_17();
		
		int x = 12;
		
		System.out.println(p.sol(x));
	}

}
