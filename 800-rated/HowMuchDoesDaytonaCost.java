import java.util.*;

public class HowMuchDoesDaytonaCost {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();   // number of test cases

        while (t-- > 0) {
            System.out.println(solve());
        }
    }

    static String solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        boolean f=false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(a[i]==k)
                f=true;
        }
        return f?"YES":"NO";
        
    }
}
