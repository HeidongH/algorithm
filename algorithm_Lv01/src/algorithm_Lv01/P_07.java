package algorithm_Lv01;

public class P_07 {
    
    public static int sol(int num) {
        int ans = 0;

        while(ans <= 500) {
            if(num == 1) {
                return ans;
            } else if(num % 2 == 0) { 
                num = num / 2;
            } else if(num % 2 == 1) { 
                num = num * 3 + 1;
            }

            ans++;
        }

        if(ans >= 500) ans = -1;

        return ans;
    }


    public static void main(String[] args) {
        // 콜라츠 추측

        int x = sol(626331);
        System.out.println(x);

    }
}
