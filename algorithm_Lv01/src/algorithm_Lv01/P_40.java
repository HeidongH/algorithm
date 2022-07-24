package algorithm_Lv01;

public class P_40 {
	
	public static int solution(int left, int right) {
		
        int answer = 0;
        
        for(int i=left; i<=right; i++) { // 13 ~ 17
        	int cnt = 0; // 약수의 개수
        	for(int j=1; j<=i; j++) {
        		if(i % j == 0) {
        			cnt++;
        		}
        	}
        	if(cnt % 2 == 0) { // 약수의 개수가 짝수라면
        		answer += i;
        	} else {
        		answer -= i;
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// 약수의 개수와 덧셈

		int left = 13;
		int right = 17;
		
		System.out.println(solution(left, right));
	}

}
