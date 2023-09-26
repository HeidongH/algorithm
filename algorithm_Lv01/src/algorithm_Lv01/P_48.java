package algorithm_Lv01;
import java.util.*;

public class P_48 {
	
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        
        // 플레이어 이름과 순번 map에 담기
        for(int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        // 스왑
        for(int i=0; i<callings.length; i++) {
            String call = callings[i];
            int call_idx = map.get(call);
            String front = players[call_idx - 1];
            int front_idx = map.get(front);
            players[call_idx] = front;
            players[front_idx] = call;
            // map도 바꿔주기
            map.put(front, call_idx);
            map.put(call, front_idx);
        }
        return players;
    }

	public static void main(String[] args) {
		// 달리기 경주
		P_48 p = new P_48();
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		String[] result = p.solution(players, callings);
		System.out.println(Arrays.asList(result));
	}

}
