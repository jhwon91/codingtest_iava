
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[N+1];
        Arrays.fill(arr,true);
        arr[0] = arr[1] = false;

        for(int i = 2; i*i<=N;i++){
            if(arr[i]){
                for(int j = i * i; j<=N; j += i){
                    arr[j] = false;
                }
            }
        }

        for(int i = M ;i<= N;i++){
            if(arr[i]){
                System.out.println(i);
            }
        }


    }
}