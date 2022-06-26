package algorithm_Lv01;

public class P_31 {

    public String solution(String s) {
        String answer = "";
        String[] list = s.split("");

        if(list.length % 2 == 1) {
            answer = list[list.length/2];
        } else {
            answer = list[list.length/2-1] + list[list.length/2];
        }

        return answer;
    }
    
    public static void main(String[] args) {
        // 가운데 글자 가져오기

        P_31 p = new P_31();
        String s = "qwer";

        System.out.println(p.solution(s));
    }
}
