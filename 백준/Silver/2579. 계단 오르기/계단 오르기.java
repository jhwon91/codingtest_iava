import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num+1];
        int[] dp = new int[num+1];
        for(int i = 1; i<num+1; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = arr[1];
        if(num > 1){
            dp[2] = arr[1] + arr[2];
        }

        for(int i = 3; i < num + 1;i++){
            dp[i] = Math.max(dp[i-2]+arr[i],dp[i-3]+arr[i-1]+arr[i]);
        }

        System.out.print(dp[num]);


    }
}
