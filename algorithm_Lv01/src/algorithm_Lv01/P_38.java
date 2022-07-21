package algorithm_Lv01;

import java.util.Arrays;

public class P_38 {
    
    public int solution(int[] d, int budget) {
        int answer = 0;
        int cost = 0;

        Arrays.sort(d); // 1 2 3 4 5
        
        for(int i=0; i<d.length; i++) {
        	if(cost + d[i] > budget) { // 원소 + 원소 > 예산 break
        		break;
        	} else { // 예산보다 작으면 cost에 저장 answer 회수 증가
        		cost += d[i];
        		answer++;
        	}
        }

        return answer;
    }
    
    public int solution2(int[]d, int budget) {
    	int answer = 0;
    	
    	Arrays.sort(d);
    	
    	for(int i=0; i<d.length; i++) {
    		
    		budget -= d[i]; 
    		// 예산에서 원소 빼기 (정렬을 했으니까 작은 수 부터 빼나가는 것)
    		// 그러다 0 보다 작아지면 반복문 탈출
    		// 0보다 크다면 answer 카운트 증가
    		
    		if(budget < 0) break;
    		
    		answer ++;
    	}
    	
    	return answer;
    	
    }

    public static void main(String[] args) {
        // 예산

        P_38 p = new P_38();
        int[] d = {1,3,2,5,4};
        int budget = 9;

        System.out.println(p.solution(d, budget));
    }
}
