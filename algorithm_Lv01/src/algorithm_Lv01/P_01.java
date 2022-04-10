package algorithm_Lv01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P_01 {

	public static void main(String[] args) throws Exception {
		// 프로그래머스 직사각형 별찍기

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("n 정수 입력");
		int n = Integer.parseInt(br.readLine());
		
		System.out.println("m 정수 입력");
		int m = Integer.parseInt(br.readLine());

		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		br.close();
	}

}
