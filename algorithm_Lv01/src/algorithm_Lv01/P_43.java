package algorithm_Lv01;

public class P_43 {
	
	public static int ans = 0;
	
	public int solution(int[] number) {	
		int[] list = new int[number.length-1];
		
		if(number.length < 3) { // 더이상 더할 수가 없을 경우 탈출
			return ans;
		}
		
		for(int i=0; i<number.length; i++) {
			if(i+1 != number.length) {
				list[i] = number[i+1];
			}
			for(int j=i+2; j<number.length; j++) {
				if(i == number.length) {
					break;
				}
				int x = number[0] + number[i+1] + number[j];
				if(x == 0) {
					ans++;
				}
			}
		}
		return solution(list);
	}

	public static void main(String[] args) {
		// 삼총사
		P_43 p = new P_43();
		int[] number = {-3, -2, -1, 0, 1, 2, 3};
		
		System.out.println(p.solution(number));
		
	}

}
