package algorithm_Lv01;

import java.util.Arrays;

public class P_28 {

	public int[] solution(int[] arr, int divisor) {
        
        int cnt = 0;
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		cnt++;
        	}
        }
        
        if(cnt == 0) {
        	return new int[] {-1};
        }
        
        int[] answer = new int[cnt];
        
        cnt = 0;
        for(int j=0; j<arr.length; j++) {
        	if(arr[j] % divisor == 0) {
        		answer[cnt] = arr[j];
        		cnt++;
        	}
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
	
	// 람다 stream filter 사용
	public int[] sol2(int[] arr, int divisor) {
		
		int[] ans = Arrays.stream(arr).filter(x -> x % divisor == 0).toArray();
		// arr 배열을 Arrays stream을 생성하고 filter를 통해 원하는 조건을 걸러낸다.
		// toArray() = ArrayList의 요소를 새 배열에 복사함.
		if(ans.length == 0) {
			return new int[] {-1};
		} else {
			Arrays.sort(ans);
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		// 나누어 떨어지는 숫자 배열
		P_28 p = new P_28();
		int[] arr = {3,2,6};
		int div = 10;
		
		int[] ans = p.solution(arr, div);
		int[] ans2 = p.sol2(arr, div);
		
		System.out.println(Arrays.toString(ans));
		System.out.println(Arrays.toString(ans2));
	}

}
