import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] num = new int[t];

        for(int i = 0; i<t; i++){
            num[i] = sc.nextInt();
        }

        int maxnum = Arrays.stream(num).max().getAsInt();
        long[] dp = new long[maxnum+1];
        dp[0] = 0;
        dp[1] = 1;
        if(maxnum>1){
            dp[2] = 1;
        }


        for(int i = 3; i<=maxnum; i++){
            dp[i] = dp[i-2] + dp[i-3];
        }

        for(int i = 0; i<num.length; i++){
            int resultNum = num[i];
            System.out.println(dp[resultNum]);
        }

        sc.close();
    }
}
