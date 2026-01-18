import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] wine = new int[num+1];

        for(int i = 1; i<wine.length; i++){
            wine[i] = Integer.parseInt(br.readLine());
        }
        // 안마신다  dp[i-1]
        // 마시고 하나 뒤에 것 안 마신다 wine[i] + dp[i-2]
        // 마시고 하나 뒤에 것도 마신다. wine[i] + wine[i-1] + dp[i-3]

        long[] dp = new long[num + 1];
        if (num >= 1) dp[1] = wine[1];
        if (num >= 2) dp[2] = wine[1] + wine[2];
        for(int i = 3; i<dp.length;i++){
            dp[i] = Math.max(dp[i-1],
                    Math.max(wine[i]+dp[i-2],wine[i]+wine[i-1]+dp[i-3]));
        }

        System.out.println(dp[num]);
    }
}
