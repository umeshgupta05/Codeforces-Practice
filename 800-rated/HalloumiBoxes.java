import java.util.*;
// 800-1 https://codeforces.com/problemset/problem/1903/A
public class HalloumiBoxes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println(solve(sc));
        }
        
        sc.close();
    }
    
    private static String solve(Scanner sc) {
        // Read input
        int n = sc.nextInt();
        int k=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Solve the problem
        if(k>1)
            return "YES";
        boolean f=true;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                f=false;
                break;
            }
        }
        return f?"YES":"NO";
        
      
    }
}