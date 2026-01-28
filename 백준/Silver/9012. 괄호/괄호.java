
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N ; i++){
            String arr = br.readLine();

            int count = 0;

            for(int j = 0; j<arr.length(); j++){
                if(arr.charAt(j) == '('){
                    count++;
                }else{
                    count--;
                }

                if(count < 0){
                    count = -1;
                    break;
                }
            }
            if(count == 0){
                sb.append("YES").append("\n");
            }else {
                sb.append("NO").append("\n");
            }
        }

        System.out.print(sb);
    }
}
