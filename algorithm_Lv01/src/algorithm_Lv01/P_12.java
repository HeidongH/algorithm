package algorithm_Lv01;

public class P_12 {
    public static long sol(long n) {
        // 정수 제곱근 판별

        double x = Math.sqrt(n); // 제곱근
        long ans;

        if(Math.pow((int)x, 2) == n) {
            ans = (long)Math.pow(x+1, 2);
        } else {
            ans = -1;
        }

        return ans;

    }

    public static void main(String[] args) {
        long x = 1;

        System.out.println(sol(x));
        
    }
}
