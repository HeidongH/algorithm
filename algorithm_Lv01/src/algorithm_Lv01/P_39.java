package algorithm_Lv01;

public class P_39 {
	
	public int solution(int n) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while(n > 0) {
        	if(n % 3 == 0) {
        		sb.append(0);
        	} else {
        		sb.append(n % 3);
        	}
        	n = n / 3;
        }
        String x = sb.toString();
        answer = Integer.parseInt(x, 3); 
        // parseInt() 메소드는 첫번째 인자에 String 형태의 숫자
        // 두번째 인자에 몇 진수를 10진수로 변경할건지 넣어주면 된다.
        // 3진수를 10진수로 바꿔야 하니까 두번째 인자에 3을 넣는다.
        
        return answer;
    }

	public static void main(String[] args) {
		// 3진법 뒤집기

		P_39 p = new P_39();
		
		int n = 45;
		
		System.out.println(p.solution(n));
	}

}
