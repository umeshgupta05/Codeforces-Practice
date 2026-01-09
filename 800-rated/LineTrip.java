import java.util.*;
// 800-2 https://codeforces.com/problemset/problem/1901/A
public class LineTrip {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println(solve(sc));
        }
        
        sc.close();
    }
    
    private static int solve(Scanner sc) {
        // Read input
        int n = sc.nextInt();
        int x=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res=Math.max(arr[0],2*(x-arr[n-1]));
        for(int i=1;i<n;i++)
        {
            res=Math.max(res,arr[i]-arr[i-1]);
        }
        return res;
      
    }
}