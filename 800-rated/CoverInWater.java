import java.util.*;
// 800-3 https://codeforces.com/problemset/problem/1900/A
public class CoverInWater {
    
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
        sc.nextLine();
        String s=sc.nextLine();
        char arr[]=s.toCharArray();
        int res=0,count=0;
        for(char c:arr)
        {
            if(c=='.')
            {
                count++;
            }
            else{
                res+=count;
                count=0;
            }
            if(count>2)
                return 2;
        }
        res+=count;
        return res;
      
    }
}