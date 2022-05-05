package algorithm_Lv01;

public class P_16 {
    public static String sol(String s) {
        String ans = "";
        String[] x = s.split("");
        
        int idx = 0;
        
        for(String zxc : x) {
        	idx = zxc.contains(" ") ? 0 : idx+1;
        	ans += idx % 2 == 0 ? zxc.toLowerCase() : zxc.toUpperCase();
        }

        return ans;
    }

    public static void main(String[] args) {
        String test = "try hello world";

        String ans = sol(test);
        System.out.println(ans);
    }
}