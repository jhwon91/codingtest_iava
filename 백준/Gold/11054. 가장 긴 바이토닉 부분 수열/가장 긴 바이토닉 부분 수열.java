import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] score = new int[num];
        int[] LIS = new int[num];
        int[] LDS = new int[num];

        Arrays.fill(LIS,1);
        Arrays.fill(LDS,1);

        for(int i = 0; i<num; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i<num; i++){
            for(int j = 0; j<i;j++){
                if(score[j] < score[i]){
                    LIS[i] = Math.max(LIS[i], LIS[j] + 1);
                }
            }
        }

        for(int i = num-2 ; i >= 0; i--){
            for(int j = num-1; j > i; j--){
                if(score[i] > score[j]){
                    LDS[i] = Math.max(LDS[i], LDS[j] + 1);
                }
            }
        }

        int result = 0;
        for(int i = 0; i<num;i++){
            result = Math.max(result, LIS[i] + LDS[i] - 1);
        }
        System.out.println(result);
    }
}
