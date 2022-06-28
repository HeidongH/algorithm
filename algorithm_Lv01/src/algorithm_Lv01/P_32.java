package algorithm_Lv01;

public class P_32 {
    
    public long solution(int price, int money, int count) {
        // 부족한 금액 계산하기

        long answer = -1;

        long cal_price = price;
        for(int i=2; i<=count; i++) {
            cal_price += (price * i);
        }
        answer = Math.abs(money - cal_price);
        if(money - cal_price >= 0) {
            answer = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        P_32 p = new P_32();

        int price = 3;
        int money = 20;
        int count = 4;

        System.out.println(p.solution(price, money, count));
    }
}
