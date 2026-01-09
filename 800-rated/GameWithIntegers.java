import java.util.*;
// 800-4 https://codeforces.com/problemset/problem/1899/A
public class GameWithIntegers {
    
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
        if(n%3==0)
            return "Second";
        return "First";
      
    }
}