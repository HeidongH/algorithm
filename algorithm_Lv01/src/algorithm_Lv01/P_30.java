package algorithm_Lv01;

public class P_30 {

    public int solution(String dartResult) {
        // dart game
        int answer = 0;

        char [] arr = dartResult.toCharArray();
        int [] round = new int[3]; // 3개의 라운드
        int idx = -1;

        for(int i=0; i<arr.length; i++) {
            if(Character.isDigit(arr[i])) { // i가 숫자라면
                idx++;
                if(arr[i] == '0') { // 10일 경우 체크
                    // 여기 해야함.
                }
                round[idx] = Character.getNumericValue(arr[i]); // 배열에 담음
            } else if(arr[i] == 'S') { // 계산 불필요
                continue;
            } else if(arr[i] == 'D') { // 2제곱
                round[idx] = (int) Math.pow(round[idx], 2);
            } else if(arr[i] == 'T') { // 3제곱
                round[idx] = (int) Math.pow(round[idx], 3);
            } else if(arr[i] == '*') { // 이전 점수, 현재 점수 x2
                round[idx-1] *= 2;
                round[idx] *= 2;
            } else if(arr[i] == '#') { // 현재 점수 * -1
                round[idx] *= -1;
            }
        }
        
        answer = round[0] + round[1] + round[2];

        return answer;
    }
    
    public static void main(String[] args) {
        P_30 p = new P_30();
        
        String x = "1S2D*3T";

        System.out.println(p.solution(x));
    }
}
