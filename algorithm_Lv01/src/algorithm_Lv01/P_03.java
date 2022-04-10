package algorithm_Lv01;

import java.util.Arrays;

public class P_03 {

    public static int[][] sol(int[][] arr1, int[][] arr2) {
        int[][] answer;
        answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[0].length; j++) {
                // arr1[i][j] += arr2[i][j]; 이 경우 arr1 리턴
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        // 행렬의 덧셈
        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};
        
        int[][] answer;
        
        answer = sol(arr1, arr2);
        System.out.println(Arrays.deepToString(answer));
        
    }
}
