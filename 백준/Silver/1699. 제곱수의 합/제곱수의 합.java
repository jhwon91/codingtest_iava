import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[num+1];
        Arrays.fill(dp,100000);
        dp[0]= 0;
        for(int i = 1 ; i<num+1;i++){
            for(int j = 1; j * j <= i ; j++){
                int sq = j * j;
                dp[i] = Math.min(dp[i], dp[i-sq] + 1);
            }
        }
        System.out.print(dp[num]);
    }
}
