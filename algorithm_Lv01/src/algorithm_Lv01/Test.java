package algorithm_Lv01;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {

		int x = 1;
		int n = 5;

		Stack<String> stack = new Stack<>();
		String[] list = new String[n]; // 2진수 저장 배열 (방크기는 한변의 길이 n)

		for(int i=x; i>=1; i=i/2) { // 10진수 -> 2진수로 변환
			if(i%2 == 1) {
				stack.push("1");
			} else if(i%2 == 0) {
				stack.push("0");
			}
		}

		int check = 0;
		if(stack.size() != n) {
			for(int i=0; i<n - stack.size(); i++) {
				list[i] = "0";
				check = i;
			}
		}

		while(!stack.empty()) { // stack에서 위에서부터 꺼내면서 출력
			list[check+1] = stack.pop();
		}

		for(String s : list) {
			System.out.println(s);
		}
		
		

	}

}
