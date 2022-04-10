package algorithm_Lv01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P_02 {
    public static void main(String[] args) throws Exception {
        // x만큼 간격이 있는 n개의 숫자

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("정수 x 입력");
        int x = Integer.parseInt(br.readLine());

        System.out.println("자연수 n 입력");
        long n = Long.parseLong(br.readLine());
        

        if(n > 1000) {
            System.out.println("n은 1000이하의 자연수");
            return;
        }

        long[] answer = new long[(int)n];
        answer[0] = x;
        
        for(int i=1; i<n; i++) {
            answer[i] = answer[i-1] + x;
        }

        System.out.println();
        System.out.println(Arrays.toString(answer));

    }

}
