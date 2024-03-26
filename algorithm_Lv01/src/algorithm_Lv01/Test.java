package algorithm_Lv01;

class Test {
	// 간단한 식 계산하기
	public int solution(String binomial) {
		int answer = 0;
		String[] words = binomial.split(" ");
		int front = Integer.parseInt(words[0]);
		int back = Integer.parseInt(words[2]);
		String ot = words[1];

		switch (ot) {
			case "+":
				answer = front + back;
				break;
			case "-":
				answer = front - back;
				break;
			case "*":
				answer = front * back;
				break;
			case "/":
				answer = front / back;
				break;
		}

		return answer;
	}

	public static void main(String[] args) {
		Test t = new Test();
		String binomial = "43 + 12";
		int answer = t.solution(binomial);
		System.out.println(answer);
	}

}