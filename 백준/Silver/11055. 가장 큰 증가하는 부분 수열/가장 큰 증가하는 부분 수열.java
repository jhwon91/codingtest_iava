
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] score = new int[num];

        for(int i = 0; i < num; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = Arrays.copyOf(score,score.length);

        for(int i = 0; i<num; i++){
            for(int j = 0; j<i; j++){
                if(score[i] > score[j]){
                    dp[i] = Math.max(dp[i], score[i]+ dp[j]);
                }
            }
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
