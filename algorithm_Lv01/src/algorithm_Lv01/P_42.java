package algorithm_Lv01;

public class P_42 {
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        int check = 0;
        
        for(int i=0; i<lost.length; i++) {
        	int plus = lost[i] + 1;
        	int minus = lost[i] - 1;
        	
        	for(int j=0; j<reserve.length; j++) {
        		
        		if(lost[i] == reserve[j]) { // 수정필요
        			answer--;
        		}
        		 
        		if(reserve[j] == minus) {
        			answer++;
        			reserve[j] = 0;
        			break;
        		} else if(reserve[j] == plus) {
        			answer++;
        			reserve[j] = 0;
        			break;
        		} 
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// 체육복
		int n = 8; // 전체 학생 수
		int[] lost = {5,6,7}; // 체육복 잃어버린 학생 번호
		int[] reserve = {4,5}; // 여분의 체육복을 가지고 있는 학생 번호
		
		System.out.println(solution(n, lost, reserve));
	}

}
