import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] dp = new int[t+1];

        dp[1] = 1;
        if (t>1){
            dp[2] = 3;
        }

        for(int i = 3 ; i<=t; i++){
            dp[i] = (dp[i-1] + 2*dp[i-2])% 10007;
        }
        System.out.print(dp[t]);
    }
}
