package algorithm_Lv01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P_33 {
    
    public int solution(int[][] sizes) {
        // 최소직사각형

        int a = 0; // 가로
        int b = 0; // 세로

        List<Integer> width = new ArrayList<>();
        List<Integer> height = new ArrayList<>();

        for(int i=0; i<sizes.length; i++) {
            for(int j=0; j<sizes[i].length; j++) {
                if(sizes[i][j] >= sizes[i][j+1]) {
                    width.add(sizes[i][j]);
                    height.add(sizes[i][j+1]);
                } else {
                    width.add(sizes[i][j+1]);
                    height.add(sizes[i][j]);
                }
                j++; // 다음 방으로
            }
        }

        a = Collections.max(width);
        b = Collections.max(height);

        return a * b;
    }

    public static void main(String[] args) {
        P_33 p = new P_33();
        int[][] sizes = {{60,50}, {30,70}, {60,30}, {80,40}};

        p.solution(sizes);
        System.out.println(p.solution(sizes));
    }
}
