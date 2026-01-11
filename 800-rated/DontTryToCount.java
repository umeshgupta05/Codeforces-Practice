import java.util.*;

public class DontTryToCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();   

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String x = sc.next();   
            String s = sc.next();  

            System.out.println(solve(x,s));
        }

        sc.close();
    }
    static int solve(String x,String s)
    {
        
        int n=x.length(),m=s.length(),res=0;

        while(n<=5*m || res<2){
            if(x.contains(s))
                return res;
            x=x+x;
            n=2*n;
            res++;
        }
        return -1;
    }
}
