package algorithm_Lv01;

import java.util.Arrays;
import java.util.Collections;

public class P_13 {
    public long sol(long n) {
        long ans = 0;

        String x = Long.toString(n);
        String[] arr = new String[x.length()];

        for(int i=0; i<x.length(); i++) {
            arr[i] = x.substring(i, i+1);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        
        String asd = arr[0];
        for(int i=1; i<arr.length; i++) {
            asd += arr[i];
        }

        ans = Long.parseLong(asd);

        return ans;
    }

    public static void main(String[] args) {
        P_13 p = new P_13();

        long n = 1234567;

        System.out.println(p.sol(n));

    }
}
