package algorithm_Lv01;

public class P_46 {
	
	public int solution(String s) {
        int answer = 0;
        int x_cnt = 0;
        int other_cnt = 0;
        char x = '0';
        
        for(int i=0; i<s.length(); i++) {
            // 남은 글자 처리 (최대 글자수 전인 상태면 마지막 분리할 글자이니까)
            if(i == s.length() - 1) {
                answer++;
                break;
            }
            // 첫 글자 x 세팅
            if(x_cnt == 0) {
                x = s.charAt(i);
                x_cnt++;
            } else {
                // x가 아닌 글자 세팅
                char x2 = s.charAt(i);
                // 두 글자 비교
                if(x == x2) {
                    x_cnt++;
                } else {
                    other_cnt++;
                }
            }
            // 카운팅 비교
            if(x_cnt == other_cnt) {
                answer++;
                x_cnt = 0;
                other_cnt = 0;
            }
            
        }
        
        return answer;
    }
	
	public int solution2(String s) {
		int answer = 0;
		int count = 0;
		char x = '0';
		
		for(int i=0; i<s.length(); i++) {
			if(i == s.length() - 1) {
				answer++;
				break;
			}
			if(count == 0) {
				x = s.charAt(i);
				count++;
			} else {
				char x2 = s.charAt(i);
				if(x == x2) {
					count++;
				} else {
					count--;
				}
			}
			
			if(count == 0) {
				answer++;
			}
		}
        
		return answer;
    }

	public static void main(String[] args) {
		// 문자열 나누기
		
		P_46 p = new P_46();
		String s = "abracadabra";
		System.out.println(p.solution(s));

	}

}
