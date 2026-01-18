import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] score = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i  = 0; i<num; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = Arrays.copyOf(score, num);

        for(int i =1; i < num; i++){

            for(int j = 0; j < i ; j++){
                if(score[i] > score[j]){
                    dp[i] = Math.max(dp[j] + score[i], dp[i]);
                }
            }
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());

    }
}
