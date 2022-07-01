package algorithm_Lv01;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		list.forEach(x -> System.out.println(x)); // 출력
		list.stream().forEach(x -> System.out.println(x)); // 출력
		System.out.println();
		list.stream().map(x -> x * 2).forEach(x -> System.out.println(x));
		
		

	}

}
