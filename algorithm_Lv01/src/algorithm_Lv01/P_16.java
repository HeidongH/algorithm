package algorithm_Lv01;

public class P_16 {
    public static String sol(String s) {
        String ans = "";
        String[] x = s.split("");
        
        for(int i=0; i<x.length; i++) {
        	x[i] = i%2==0 ? x[i].toUpperCase() : x[i];
        }
              
        StringBuilder sb = new StringBuilder();
        for(String z : x) {
            sb.append(z);
            // sb.append(" ");
        }
        ans = sb.toString();
        return ans;
    }

    public static void main(String[] args) {
        String test = "try hello world a b c d e f";

        String ans = sol(test);
        System.out.println(ans);
    }
}

// 문자열 전체의 짝, 홀수 인덱스가 아니라 단어(공백) 기준별로 짝, 홀수 인덱스 판단 해야함.