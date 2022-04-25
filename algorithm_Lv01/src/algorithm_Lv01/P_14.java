package algorithm_Lv01;

import java.util.Arrays;

public class P_14 {
    
    public int[] sol(long n) {
        // 자연수 뒤집어 배열로 만들기
        
        String x = String.valueOf(n);

        StringBuilder sb = new StringBuilder(x);
        sb.reverse();

        String[] arr = sb.toString().split("");
        int[] ans = new int[arr.length];

        for(int i=0; i<ans.length; i++) {
            ans[i] = Integer.parseInt(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {
        P_14 p = new P_14();

        System.out.println(Arrays.toString(p.sol(12345)));
        
    }
}
