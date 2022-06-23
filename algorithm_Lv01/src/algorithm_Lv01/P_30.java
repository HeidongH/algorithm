package algorithm_Lv01;

import java.util.List;

public class P_30 {

    public int solution(String dartResult) {
        // 다트 게임
        List<Integer> cal = null;

        int answer = 0;

        String [] arr = dartResult.split("");

        for(int i=1; i<arr.length; i++) {
            if(arr[i].equals("S") && !arr[i+1].equals("*") && !arr[i+1].equals("#")) {
                answer += (Integer.parseInt(arr[i-1]));
            } else if(arr[i].equals("D") && !arr[i+1].equals("*") && !arr[i+1].equals("#")) {
                answer += Math.pow(Double.parseDouble(arr[i-1]), 2);
            } else if(arr[i].equals("T") && !arr[i+1].equals("*") && !arr[i+1].equals("#")) {
                answer += Math.pow(Double.parseDouble(arr[i-1]), 3);
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
