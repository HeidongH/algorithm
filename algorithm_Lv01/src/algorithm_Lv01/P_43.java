package algorithm_Lv01;

public class P_43 {
	
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        
        
        
        
        return answer;
    }

	public static void main(String[] args) {
		// 로또의 최고 순위와 최저 순위
		P_43 p = new P_43();
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		int[] ans = p.solution(lottos, win_nums);
		
		for(int x : ans) {
			System.out.println(x);
		}
	}

}
