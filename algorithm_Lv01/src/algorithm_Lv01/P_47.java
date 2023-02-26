package algorithm_Lv01;

public class P_47 {
	
	public String solution(String s, String skip, int index) {
		String answer = "";
		
		/*
		 * s의 문자열 전체를 돌고 index만큼 뒤로 돌리면서 skip할 문자열을 찾아야하니 반복문은 2개로
		 * 영문자는 아스키 코드로 97 ~ 122임 그래서 문자열 s의 다음 문자가 122를 넘어가게 되면 다시 97인 a로 돌아가게한다.
		 * 그리고 스킵할 문자가 포함되어 있다면 반복문 횟수를 1회 더 늘린다.
		 * 문자열에 "" 공백을 더하는 이유는 contains함수를 사용하기 위해 String 형태로 변환 한것이다.
		 */
		
		for(char x : s.toCharArray()) {
			for(int i=0; i<index; i++) {
				if(++x > 122) {
					x = 'a';
				}
				if(skip.contains(x+"")) {
					i--;
				}
			}
			answer += x;
		}
		
		return answer;
    }

	public static void main(String[] args) {
		// 둘만의 암호
		
		P_47 p = new P_47();
		String s = "aukks";
		String skip = "wbqd";
		int index = 5;
		
		System.out.println(p.solution(s, skip, index));

	}

}
