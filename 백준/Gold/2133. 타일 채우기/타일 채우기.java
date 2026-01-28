import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] dp = new int[num+1];

        if(num%2==1){
            System.out.print(0);
            return;
        }

        dp[0] = 1;
        dp[2] = 3;
        for(int i =4; i<=num; i+=2 ){
            dp[i] = dp[i-2] *dp[2];
            for(int j = i-4; j>=0; j-=2){
                dp[i] += dp[j] * 2;
            }
        }

        System.out.print(dp[num]);

        sc.close();
    }
}
