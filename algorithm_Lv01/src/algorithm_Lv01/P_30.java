package algorithm_Lv01;

public class P_30 {
	
	public static Double check(String x) {
		
		double cnt = 0;
		
		if(x.equals("S")) {
			cnt = 1;
		} else if(x.equals("D")) {
			cnt = 2;
		} else if(x.equals("T")) {
			cnt = 3;
		}
		
		return cnt;
	}

    public int solution(String dartResult) {
        // 다트 게임
        int answer = 0;
        int cnt = 0;

        String [] arr = dartResult.split("");

        for(int i=0; i<arr.length; i++) {
        	
        }


        return answer;
    }
    
    public static void main(String[] args) {
        P_30 p = new P_30();
        
        String x = "1S2D*3T";

        System.out.println(p.solution(x));
    }
}
