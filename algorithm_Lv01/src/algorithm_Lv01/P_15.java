package algorithm_Lv01;

public class P_15 {
    public int sol(int n) {
        int ans = 0;
        
        while(true) {
            ans += n % 10;

            if(n < 10) {
                break;
            }

            n = n / 10;
        }

        return ans;
    }

    public int sol2(int n) {
        int ans = 0;

        String x = String.valueOf(n);
        String[] arr = x.split("");

        for(int i=0; i<arr.length; i++) {
            ans += Integer.parseInt(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        P_15 p = new P_15();
        System.out.println(p.sol(123));

        System.out.println(p.sol2(123));
    }
}
