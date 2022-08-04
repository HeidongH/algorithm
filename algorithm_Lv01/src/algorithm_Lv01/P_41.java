package algorithm_Lv01;

import java.util.Arrays;

public class P_41 {
	
	public static int[] solution(int N, int[] stages) {
		
        int[] answer = new int[N];
        double[] rate = new double[N];
        
        // 스테이지 순차 증가
        int next_stage = 0;
        
        // 총 사용자 수
        int total_user = stages.length;
        
        Arrays.sort(stages); // 스테이지 정렬
        
        // 실패율 구하기
        for(int i=0; i<=N; i++) {
        	int cnt = 0;
        	next_stage++;
        	if(total_user < 0 || next_stage > N) {
        		break;
        	}
        	
        	for(int j=0; j<stages.length; j++) {
        		if(stages[j] == next_stage) {
        			cnt++;
        		}
        	}
        	rate[i] = (double)cnt / total_user; // 실패율
        	if(cnt != 0) {
        		total_user -= cnt;
        	}
        }
        
        for(int i=0; i<answer.length; i++) {
        	answer[i] = i+1;
        }
        
        // 실패율 내림차순 정렬
        // 삽입 정렬
        for(int i=1; i<N; i++) {
        	double target = rate[i];
        	int target2 = answer[i];
        	int j = i-1;
        	
        	// j가 0보다 크고, 현재 인덱스 i가 해당하는 실패율이 전 인덱스 위치보다 클때만 반복함.
        	// 전 인덱스보다 해당 인덱스가 클 동안
        	// 즉 순서 변경을 해야한다는 뜻.
        	// 큰 수를 앞으로 계속 이동
        	while(j >= 0 && target > rate[j]) {
        		rate[j+1] = rate[j];
        		answer[j+1] = answer[j];
        		j--;
        	}
        	// 반복문이 끝남 = 현재 인덱스가 전보다 더 작음
        	// 내림차순 정렬 됨
        	// j번째 원소 뒤에 현재 현재 인덱스인 더 작은 요소를 넣음.
        	rate[j+1] = target;
        	answer[j+1] = target2;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// 실패율
		
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int n = 5;
		
		int[] answer = solution(n, stages);
		
		for(int x : answer) {
			System.out.println(x);
		}
	}

}
