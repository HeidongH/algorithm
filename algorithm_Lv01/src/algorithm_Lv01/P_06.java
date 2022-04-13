package algorithm_Lv01;

public class P_06 {
    public static void main(String[] args) {
        
        int[] x = {1,2,3,4};

        double ans = 0;

        for(int i=0; i<x.length; i++) {
            ans += x[i];
        }

        ans = ans / x.length;

        System.out.println(ans);
    }
}
