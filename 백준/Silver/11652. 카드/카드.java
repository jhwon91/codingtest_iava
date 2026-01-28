import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];

        for(int i = 0; i < N; i++){
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        long currentValue = arr[0];
        int currentCount = 1;

        long answer = arr[0];
        int maxCount = 1;

        for(int i = 1; i<N; i++){
            if(currentValue == arr[i]){
                currentCount++;
            } else {
                if(currentCount > maxCount){
                    answer = currentValue;
                    maxCount = currentCount;
                }
                currentValue = arr[i];
                currentCount = 1;
            }
        }
        if (currentCount > maxCount) {
            answer = currentValue;
        }
        System.out.print(answer);

    }
}
