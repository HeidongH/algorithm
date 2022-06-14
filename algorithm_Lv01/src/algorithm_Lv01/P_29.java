package algorithm_Lv01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_29 {

	public int[] solution(int []arr) {

		List<Integer> ans = new ArrayList<>();
		int cnt = 0;

		ans.add(arr[0]);

		for(int i = 0; i<arr.length; i++) {
			if(i+1 == arr.length) break;

			if(ans.get(cnt) == arr[i+1]) {
				continue;
			}
			ans.add(arr[i+1]);
			cnt++;
		}

		return ans.stream().mapToInt(x -> x).toArray();
    }

	public static void main(String[] args) {
		// 같은 숫자는 싫어
		P_29 p = new P_29();
		int[]arr = {4,4,4,3,3};
		int[]ans = p.solution(arr);
		System.out.println(Arrays.toString(ans));
	}

}
