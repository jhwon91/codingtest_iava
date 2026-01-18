
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long[][] dp = new long[t+1][10];
        long MOD = 10007;

        for(int i = 0; i<10; i++){
            dp[1][i] = 1;
        }

        for(int i = 2; i<dp.length;i++){
            for(int j = 0; j<10;j++){
                for(int k = 0; k<=j;k++){
                    dp[i][j] = (dp[i][j]+dp[i-1][k])%MOD;
                }
            }
        }

        long sum = 0;

        for(int i = 0; i<dp[t].length;i++){
            sum = (sum + dp[t][i])%MOD;
        }

        System.out.println(sum);
    }
}
