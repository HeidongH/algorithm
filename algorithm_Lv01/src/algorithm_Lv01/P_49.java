package algorithm_Lv01;
import java.util.*;

public class P_49 {
	
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        // mapping name, yearning to map
        for(int i=0; i<yearning.length; i++) {
            map.put(name[i], yearning[i]);
        }
                
        // calculate photo score
        for(int i=0; i<photo.length; i++) {
            int score = 0;
            for(int j=0; j<photo[i].length; j++) {
                String key_name = photo[i][j];
                int value_score = 0;
                // check null
                if(map.get(key_name) == null) {
                    value_score = 0;
                } else {
                    value_score = map.get(key_name);
                }
                score += value_score;
            }
            answer[i] = score;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// 추억 점수
		P_49 p = new P_49();
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {
				{"may", "kein", "kain", "radi"},
				{"may", "kein", "brin", "deny"}, 
				{"kon", "kain", "may", "coni"}
		};
		int[] result = p.solution(name, yearning, photo);
		System.out.println(Arrays.toString(result));
	}

}
