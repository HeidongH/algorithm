package algorithm_Lv01;

public class P_21 {
	
	public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0; i<seoul.length; i++) {
        	if(seoul[i].equals("Kim")) {
        		answer = String.valueOf(i);
        		break;
        	}
        }
        
        return "김서방은 " + answer + "에 있다";
    }
	
	
	public static void main(String[] args) {
		// 서울에서 김서방 찾기
		
		P_21 p = new P_21();
		String [] x = {"Jane", "Kim"};
		
		System.out.println(p.solution(x));
		
	}

}
