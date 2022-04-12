package algorithm_Lv01;

import java.util.Arrays;

public class P_05 {
    
    public static boolean sol(int x) {

        if(x < 1 || x > 10000) {
            return false;
        }

        int sum = 0;
        int a = x;

        while(a >= 1) {
            sum += a % 10;
            a /= 10;
        }

        if(x % sum == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) throws Exception {
        // 하샤드 수

        int test = 200;
        String msg;
        boolean ans = sol(test);

        msg = (ans==true) ? "하샤드 수 맞음" : "하샤드 수 아님";

        System.out.println(test +" "+ msg);

    }
}
