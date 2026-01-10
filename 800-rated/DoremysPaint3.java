import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DoremysPaint3 {
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
        int[] arr = new int[n];
        int c=0,ind=0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                c++;
                ind=i;
            }
            if(c>1)
                return "NO";

        }
        
        if(Math.abs(2*ind-n)<=1 || ind==0)
            return "YES";
        return "NO";
        
      
    }
    
}
