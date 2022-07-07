package algorithm_Lv01;

import java.util.Arrays;
import java.util.Stack;

public class Test {

	public String[] binary(int x, int n) {
		
		// 10진수 -> 2진수 변환

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
			while(!stack.empty()) { // stack에서 위에서부터 꺼내면서 출력
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
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		// 다른 사람 풀이
        String[] result = new String[n];
        
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }

	public static String makeSharp(int n, int m) { // n = 합쳐진 10진수, m = 한변의 길이
        if(n == 0) { // 10진수 0은 2진수도 0
            if( m > 0) { // 한 변의 길이가 5이상일때(2진수 자리수) 앞자리 공백용
                String str = "";
                for(int i = 0; i < m; i++) {
                    str += " ";
                }
                return str;
            }
            else return "";
        }
        else {
            return n % 2 == 0 ? makeSharp(n/2, m-1) + " " : makeSharp(n/2, m-1) + "#"; 
        }
    }
    public static String[] solution2(int n, int [] arr1, int [] arr2) {
        String [] answer = new String[n];
        int [] secretMap = new int[n];
        for(int i = 0; i < n; i++) {
            secretMap[i] = arr1[i] | arr2[i]; // 2개 배열의 원소를 2진수 비트 단위 연산 한 것임.
			System.out.println(i + " " +secretMap[i]);
            answer[i] = makeSharp(secretMap[i], n);
        }
        return answer;
    }

	public static void main(String[] args) {

		int x = 21;
		int n = 5;
		
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		System.out.println(Arrays.toString(solution2(n, arr1, arr2)));
	}

}
