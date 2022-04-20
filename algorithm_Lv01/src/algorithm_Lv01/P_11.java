package algorithm_Lv01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P_11 {
    // 제일 작은 수 제거
    public int[] sol(int[] arr) {
        int[] ans = new int[arr.length];

        if(arr.length <= 1) {
            ans[0] = -1;
            return ans;
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            for(int a : arr) {
                list.add(a);
            }
            Integer x = Collections.min(list);
            list.remove(x);
            ans = new int[arr.length-1];
            for(int i=0; i<ans.length; i++) {
                ans[i] = list.get(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        P_11 obj = new P_11();
        int[] x = {4,3,2,1};
        int[] ans = obj.sol(x);

        System.out.println(Arrays.toString(ans));
        
    }
}
