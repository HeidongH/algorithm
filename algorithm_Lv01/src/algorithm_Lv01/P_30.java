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

    public static int star(int before, int now) {
        return (before*2) + (now*2);
    }

    public static int shop(int before, int now) {
        return before + (now * -1);
    }

    public int solution(String dartResult) {
        // dart game
        int answer = 0;
        int before = 0;
        int cnt = 0;

        String [] arr = dartResult.split("");

        for(int i=0; i<arr.length; i++) {
            // check 10
        	if(arr[i+1].equals("0") && !arr[i+2].equals("*") && !arr[i+2].equals("#")) {
                answer += Math.pow(10, check(arr[i+2]));
            } else if() {
                
            }
        }


        return answer;
    }
    
    public static void main(String[] args) {
        P_30 p = new P_30();
        
        String x = "1S2D*3T";

        System.out.println(p.solution(x));
    }
}
