package algorithm_Lv01;

import java.util.Arrays;

public class P_10 {
    // 최대공약수와 최소공배수
    public static int[] sol(int n, int m) {
        int[] ans = new int[2];
        ans[0] = gcd(n, m);
        ans[1] = (n*m) / ans[0]; // LCM 최소공배수
        return ans;
    }

    public static int gcd(int a, int b) {
        if(b==0) return a;
        else {
            return gcd(b, a%b);
        }
    }

    public static void main(String[] args) {
        int[] x = sol(2, 5);
        
        System.out.println(Arrays.toString(x));

    }
}
