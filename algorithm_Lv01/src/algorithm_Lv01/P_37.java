package algorithm_Lv01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P_37 {

    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        int check = 0;
        
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                check = numbers[i] + numbers[j];    

                if(! list.contains(check)) {
                    list.add(check);
                }
            }
        }
        Collections.sort(list);

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }


    public static void main(String[] args) {
        // 두 개 뽑아서 더하기

        P_37 p = new P_37();
        int[] x = {2,1,3,4,1};
        System.out.println(Arrays.toString(p.solution(x)));
    }
}
