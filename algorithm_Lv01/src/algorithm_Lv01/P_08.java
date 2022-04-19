package algorithm_Lv01;

public class P_08 {
    // 피보나치 수
    public static int sol(int n) {
        int ans = 0;
        int a = 1;
        int b = 1;

        if(n == 1 || n == 2) {
            return 1;
        }

        for(int i=3; i<=n; i++) {
            ans = (a+b) % 1234567;
            a = b;
            b = ans;
            System.out.println(a +","+ b);
        }

        return ans;
    }

    public static void main(String[] args) {
        int x = sol(5);
        System.out.println(x);
    }
}
