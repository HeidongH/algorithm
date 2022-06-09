package algorithm_Lv01;

public class P_26 {
	
	boolean solution(String s) {
        boolean answer = false;
        int p = 0;
        int y = 0;
        
        String [] x = s.split("");
        for(int i=0; i<x.length; i++) {
        	if(x[i].equalsIgnoreCase("y")) {
        		y++;
        	} else if(x[i].equalsIgnoreCase("p") ) {
        		p++;
        	} 
        }
        
        if(p == 0 && y == 0) {
        	return true;
        } else if(p == y) {
        	return true;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// 문자열 내 p와 y의 개수
		
		P_26 p = new P_26();
		
		String x = "pPoooyY";
		
		System.out.println(p.solution(x));
		
	}

}
