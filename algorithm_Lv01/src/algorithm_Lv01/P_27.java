package algorithm_Lv01;

public class P_27 {

	public long solution(int a, int b) {
        long answer = a;
        int c = 0;
        
        if(a == b) {
        	return a;
        } else {
        	if(a > b) { 
        		c = a; // 큰수 
        		a = b; // a가 작은수
        		b = c; // b에 큰수
        		answer = a;
        	}
        }
        
        for(int i=a; i<b; i++) { 
        	answer += i+1;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// 두 정수 사이의 합
		P_27 p = new P_27();
		
		int a = 5;
		int b = 3;
		
		System.out.println(p.solution(a, b));
	}

}
