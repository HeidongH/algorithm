package algorithm_Lv01;

public class P_09 {
    // 짝수와 홀수
    public static String sol(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(sol(x));
    }
    
}
