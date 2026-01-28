import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = Arrays.copyOf(arr,num);

        for(int i = 1 ; i<num; i++){
            dp[i] = Math.max(dp[i-1] + dp[i], dp[i]);
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());

    }
}
