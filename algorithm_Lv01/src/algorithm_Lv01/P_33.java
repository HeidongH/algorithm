package algorithm_Lv01;

public class P_33 {
    
    public int solution(int[][] sizes) {
        // 최소직사각형
        int answer = 0;
        int a = 0;
        int b = 0;
        int[][] check = new int[a][b];

        // for(int i=0; i<sizes.length; i++) {
        //     if(sizes[i][0] > a) { // 2차원 배열의 첫번째 원소 탐색
        //         a = sizes[i][0];
        //     }
        //     if(sizes[i][1] > b) { // 2차원 배열의 두번째 원소 탐색
        //         b = sizes[i][1];
        //     }
        // }

        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0] > a) {
                if(sizes[i][1] > a) {
                    
                }
            }
        }

        System.out.println(a +""+ b);

        return answer;
    }

    public static void main(String[] args) {
        P_33 p = new P_33();
        int[][] sizes = {{60,50}, {30,70}, {60,30}, {80,40}};

        p.solution(sizes);
        // System.out.println(p.solution(sizes));
    }
}
