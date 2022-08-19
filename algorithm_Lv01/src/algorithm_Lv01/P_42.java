package algorithm_Lv01;

import java.util.Arrays;

public class P_42 {
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 두 배열의 중복 값 처리
        for(int i=0; i<lost.length; i++) {
        	for(int x=0; x<reserve.length; x++) {
        		if(lost[i] == reserve[x]) {
        			lost[i] = -1;
        			reserve[x] = -1;
        			answer++;
        			break;
        		}
        	}
        }
        
        // 체육복 빌려주는 로직
        for(int i=0; i<lost.length; i++) {
        	for(int j=0; j<reserve.length; j++) { 
        		if(reserve[j] == lost[i]-1) {
        			answer++;
        			reserve[j] = -1;
        			lost[i] = -1;
        			break;
        		} else if(reserve[j] == lost[i]+1) {
        			answer++;
        			reserve[j] = -1;
        			lost[i] = -1;
        			break;
        		}
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// 체육복
		int n = 3; // 전체 학생 수
		int[] lost = {1,2}; // 체육복 잃어버린 학생 번호
		int[] reserve = {2,3}; // 여분의 체육복을 가지고 있는 학생 번호
		
		System.out.println(solution(n, lost, reserve));
	}

}
