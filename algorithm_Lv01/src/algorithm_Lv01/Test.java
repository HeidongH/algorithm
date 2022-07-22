package algorithm_Lv01;

import java.util.ArrayList;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		int n = 45;
		int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        while(n > 0) {
        	if(n % 3 == 0) {
        		list.add(0);
        		stack.push(0);
        	} else {
        		list.add(n % 3);
        		stack.push(n % 3);
        	}
        	n = n / 3;
        }
        
        list.forEach(x -> System.out.println(x));

	}

}
