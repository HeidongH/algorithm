package algorithm_Lv01;

class P_20 {
    public String solution(int n) {
    	// 수박수박수박수?
    	
        String answer = "";

        for(int i=1; i<=n; i++) {
            if(i % 2 == 0) { 
                answer += "박";
            } else {
                answer += "수";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        P_20 sol = new P_20();

        System.out.println(sol.solution(5));

    }
}