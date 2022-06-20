package algorithm_Lv01;

public class P_22 {
	
	// 시간 초과 걸림
	public int solution(int n) {
        int answer = 0;
        
        for(int i=2; i<=n; i++) { // n이 2이상 이니까, 전체 반복은 n 만큼
        	for(int j=2; j<=i; j++) { 
        		if(i == j) { // i와 j가 같다는 뜻은 반복문을 다 돌았다는 뜻 = 1과 자기자신만 약수로 가짐 = 소수
        			answer++; 
        		} else if(i % j == 0) { // i 나누기 j의 나머지가 0이라는 뜻은 배수라는 뜻(i가 j의 배수임)
        			break; // 1과 자기 자신을 제외하고 배수가 있다는 것은 소수가 아니라는 뜻 
        		}
        	}
        }
        
        return answer;
    }
	
	// 정답
	public int solution2(int n) {
        int answer = 0; // 정답 정의
        int[] arr = new int[n+1];   // int타입의 arr은 n+1개의 갯수만큼 int타입으로 공간을 가짐

        // 모든 수를 대입
        for(int i=0;i<=n;i++){  // int타입 i; 0부터 n이하까지 반복; i++
            arr[i]=i;   // arr의 i번째 방은 i이다
        }// 0번째 방은 =1, n-1번째 방은 =n이 된다

        // 1은 소수가 아니라서 0이라고 정의 --> 0이라고 함 
        arr[1]=0;   // arr의 1번째 방은 0

        // 소수 찾기 시작
        for(int i=2;i<=n;i++){//2부터 계산해줌        int타입 i는 2; i가 n이하까지 반복; i++

            // 만약 이전에 찾았던 소수의 배수 값일 경우 계산없이 다음 수로 이동
            if(arr[i]==0) continue;  // arr[i]번째 방이 0이라면 반복문의 처음으로 이동하고 다음 진행

            // 에라토스테네스의 체를 통해 배수의 수는 소수가 아니라고 정의
            // 소수가 아닌 수를 걸러내는 작업 i의 배수를 n까지 돌면서 다 확인함.
            for(int j=i*2; j<=n; j+=i){   // int타입 j가 i*2이고; j가 n이하까지 반복; j = j+i -> 계산을 하지않고 소수가 아닌 값을 찾음
                arr[j]=0;   // arr의 j번째 방은 0 -> 소수가 아니라면
            }
        }

            // 정답 계산
        for(int i=0;i<arr.length;i++){  // 배열안에 0이 아닌 수를 구하기 위한 반복문
            if(arr[i]!=0){  // arr의 i번째 방이 0이 아니라면 -> 소수
                answer++;   // 카운팅
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		// 소수 찾기
		
		P_22 p = new P_22();
		
		int x = 10;
		System.out.println(p.solution2(x));
	}

}
