package algorithm_Lv01;

public class P_04 {

    public static String sol(String phon) {
        // 핸드폰 번호 가리기
        int front;
        String back;
        String answer;

        answer = phon.replaceAll("-", "");

        back = answer.substring(answer.length()-4, answer.length());
        
        front = answer.length() - back.length();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<front; i++) {
            sb.append("*");
        }
        sb.append(back);
        
        answer = sb.toString();

        return answer;
    }

    public static String sol2(String phon) {
        char[] ch = phon.toCharArray();
        for(int i=0; i<ch.length-4; i++) {
            ch[i] = '*';
        }

        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String ans = sol("010-1234-5678");
        String ans2 = sol2("01012345678");

        System.out.println(ans);
        System.out.println(ans2);

    }
}
