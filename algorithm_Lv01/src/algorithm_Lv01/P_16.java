package algorithm_Lv01;

public class P_16 {
    public static String sol(String s) {
        String ans = "";
        String[] x = s.split(" ");

        for(int i=0; i<x.length; i++) { // 전체 배열 돌기
            for(int j=0; j<x[i].length(); j++) { // 배열 원소 하나 글자갯수에서 돌기
                if(j % 2 == 0) {
                    // 짝수인 경우
                    x[i].substring(j, j+1).toUpperCase();
                }
                
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String z : x) {
            sb.append(z);
        }
        ans = sb.toString();
        return ans;
    }

    public static void main(String[] args) {
        String test = "my name is hyeok";

        String ans = sol(test);
        System.out.println(ans);
    }
}
