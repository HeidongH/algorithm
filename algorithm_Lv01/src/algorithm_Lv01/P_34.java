package algorithm_Lv01;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class P_34 {
    public String solution(int a, int b) {
        // 2016년
        
        // 윤년 2월이 29일까지 있음
        
        // DayOfWeek의 getValue() 메소드는 월요일=1, 일요일=7 임.
        String [] day = {"SUN","MON","TUE","WED","THU","FRI","SAT","SUN"};
        
        LocalDate date = LocalDate.of(2016, a, b); // = yyyy-mm-dd
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int ans = dayOfWeek.getValue();
        
        String answer = day[ans];
        return answer;
    }

    public static void main(String[] args) {
        P_34 p = new P_34();
        System.out.println(p.solution(2, 29));
    }
}
