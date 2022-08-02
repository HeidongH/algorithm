package algorithm_Lv01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P_41 {
	
	public static int[] solution(int N, int[] stages) {
		
        int[] answer = new int[N];
        
        // 총 사용자 수
        int total_user = stages.length;
        
        // 최대 스테이지 구하기
        int max = 0;
        for(int x : stages) {
        	max = Math.max(x, max);
        }
        
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(stages); // 스테이지 정렬
        
        for(int i=1; i<=max; i++) {
        	int cnt = 0;
        	
        	for(int j=0; j<stages.length; j++) {
        		if(stages[i] == stages[j]) {
        			cnt++;
        		}
        	}
        	if(cnt == 0) { // 스테이지 배열에 없을 경우
        		list.add(0);
        		continue;
        	}
        	if(i == 1) {
        		list.add(cnt / total_user); // 스테이지당 클리어 못한 유저의 수
        		continue;
        	}
        	total_user -= cnt;
        	list.add(cnt / total_user); // 스테이지당 클리어 못한 유저의 수
        	
        }
        
        Collections.sort(list, Collections.reverseOrder());
        list.stream().forEach(x -> System.out.println(x));
        
        
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
