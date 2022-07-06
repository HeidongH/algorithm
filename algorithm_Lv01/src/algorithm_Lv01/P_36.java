package algorithm_Lv01;

import java.util.Arrays;
import java.util.Stack;

public class P_36 {

    public static String[] binary(int x, int n) {
        // 10진수 -> 2진수 변환 메소드

		Stack<String> stack = new Stack<>();
		String[] list = new String[n]; // 2진수 저장 배열 (방크기는 한변의 길이 n)

		for(int i=x; i>=1; i=i/2) { // 10진수 -> 2진수로 변환
			if(i%2 == 1) {
				stack.push("1");
			} else if(i%2 == 0) {
				stack.push("0");
			}
		}

		if(stack.size() != n) {
			int check = 0;
			for(int i=0; i<n - stack.size(); i++) {
				list[i] = "0";
				check = i;
			}
			while(!stack.empty()) { // stack에서 위에서부터 꺼내면서 삭제
				list[check+1] = stack.pop();
				check++;
			}
		} else {
			for(int i=0; i<list.length; i++) {
				list[i] = stack.pop();
			}
		}

		return list;
	}

    public String[] solution(int n, int[] arr1, int[] arr2) {
        // 비밀 지도

        String[] answer = new String[n];
        int cnt = 0;

        for(int i=0; i<arr1.length; i++) { 
            String[] one = new String[n];
            String[] two = new String[n];
            String out = "";

            one = binary(arr1[i], n);
            two = binary(arr2[i], n);
            
            for(int j=0; j<one.length; j++) {
                if(one[j].equals("1") || two[j].equals("1")) {
                    out += "#";
                } else {
                    out += " ";
                }
            }
            answer[cnt] = out;
            cnt++;
        }


        return answer;
    }

    public static void main(String[] args) {
        P_36 p = new P_36();

        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        String[] ans = p.solution(n, arr1, arr2);

        System.out.println(Arrays.toString(ans));

    }
}
