
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        long result = 0;
        for(int i =0 ;i < N.length(); i++){
            char ch = N.charAt(i);
            int num;
            if('0' <= ch && ch <= '9'){
                num = ch - '0';
            } else {
                num = ch - 'A' + 10;
            }

            result = result * B + num;
        }
        System.out.print(result);






    }
}