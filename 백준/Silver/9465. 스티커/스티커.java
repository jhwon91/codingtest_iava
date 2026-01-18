
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int num = Integer.parseInt(br.readLine())+1;
            int[][] score = new int[2][num];

            for(int i  = 0; i <2; i ++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 1; j < num; j++){
                    score[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            solution(num,score);
        }
    }

    private static void solution(int num, int[][] score){
        int[][] dp = new int[2][num];

        dp[0][0] = score[0][0];
        dp[1][0] = score[1][0];
        dp[0][1] = score[0][1];
        dp[1][1] = score[1][1];

        for(int i = 2;i<num;i++){
            dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + score[0][i];
            dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + score[1][i];
        }

        System.out.println(Math.max(dp[0][num-1],dp[1][num-1]));
    }
}
