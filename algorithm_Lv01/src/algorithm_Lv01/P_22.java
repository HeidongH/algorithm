package algorithm_Lv01;

public class P_22 {
	
	public int solution(int n) {
        int answer = 0;
        
        for(int i=2; i<=n; i++) { // n이 2이상 이니까, 전체 반복은 n 만큼
        	for(int j=2; j<=i; j++) { 
        		if(i == j) { // i와 j가 같다는 뜻은 반복문을 다 돌았다는 뜻 = 1과 자기자신만 약수로 가짐 = 소수
        			answer++; 
        		} else if(i % j == 0) { // i 나누기 j의 나머지가 0이라는 뜻은 배수라는 뜻(i가 j의 배수임)
        			break; // 1과 자기 자신을 제외하고 배수가 있다는 것은 소수가 아니라는 뜻 
        		}
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// 소수 찾기
		
		P_22 p = new P_22();
		
		int x = 10;
		System.out.println(p.solution(x));
	}

}
